package com.rug.tno.fpdata;

import com.google.protobuf.InvalidProtocolBufferException;
import hla.rti1516_2024.fedpro.CallResponse;
import hla.rti1516_2024.fedpro.CallbackResponse;
import io.netty.buffer.ByteBuf;

import java.io.IOException;
import java.io.OutputStream;

public record HlaCallbackResponse(long responseTo, CallbackResponse body) implements FpPayload {
    public static HlaCallbackResponse fromByteBuf(ByteBuf buf) {
        try {
            return new HlaCallbackResponse(
                    buf.readUnsignedInt(),
                    CallbackResponse.parseFrom(buf.nioBuffer())
            );
        } catch (InvalidProtocolBufferException e) {
            throw new FpPayloadParseException(e);
        }
    }

    @Override
    public void writeToByteBuf(ByteBuf buf) {
        try {
            buf.writeInt((int)this.responseTo);
            this.body().writeTo(new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    buf.writeByte(b);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
