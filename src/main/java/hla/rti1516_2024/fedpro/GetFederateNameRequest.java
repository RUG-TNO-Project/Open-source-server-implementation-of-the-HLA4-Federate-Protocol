// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.GetFederateNameRequest}
 */
public final class GetFederateNameRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.GetFederateNameRequest)
    GetFederateNameRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      GetFederateNameRequest.class.getName());
  }
  // Use GetFederateNameRequest.newBuilder() to construct.
  private GetFederateNameRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetFederateNameRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetFederateNameRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetFederateNameRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.GetFederateNameRequest.class, hla.rti1516_2024.fedpro.GetFederateNameRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FEDERATE_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.FederateHandle federate_;
  /**
   * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
   * @return Whether the federate field is set.
   */
  @java.lang.Override
  public boolean hasFederate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
   * @return The federate.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.FederateHandle getFederate() {
    return federate_ == null ? hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance() : federate_;
  }
  /**
   * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.FederateHandleOrBuilder getFederateOrBuilder() {
    return federate_ == null ? hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance() : federate_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getFederate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFederate());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof hla.rti1516_2024.fedpro.GetFederateNameRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.GetFederateNameRequest other = (hla.rti1516_2024.fedpro.GetFederateNameRequest) obj;

    if (hasFederate() != other.hasFederate()) return false;
    if (hasFederate()) {
      if (!getFederate()
          .equals(other.getFederate())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFederate()) {
      hash = (37 * hash) + FEDERATE_FIELD_NUMBER;
      hash = (53 * hash) + getFederate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.GetFederateNameRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(hla.rti1516_2024.fedpro.GetFederateNameRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rti1516_2024.fedpro.GetFederateNameRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.GetFederateNameRequest)
      hla.rti1516_2024.fedpro.GetFederateNameRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetFederateNameRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetFederateNameRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.GetFederateNameRequest.class, hla.rti1516_2024.fedpro.GetFederateNameRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.GetFederateNameRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        internalGetFederateFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      federate_ = null;
      if (federateBuilder_ != null) {
        federateBuilder_.dispose();
        federateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetFederateNameRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetFederateNameRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.GetFederateNameRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetFederateNameRequest build() {
      hla.rti1516_2024.fedpro.GetFederateNameRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetFederateNameRequest buildPartial() {
      hla.rti1516_2024.fedpro.GetFederateNameRequest result = new hla.rti1516_2024.fedpro.GetFederateNameRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.GetFederateNameRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.federate_ = federateBuilder_ == null
            ? federate_
            : federateBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.GetFederateNameRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.GetFederateNameRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.GetFederateNameRequest other) {
      if (other == hla.rti1516_2024.fedpro.GetFederateNameRequest.getDefaultInstance()) return this;
      if (other.hasFederate()) {
        mergeFederate(other.getFederate());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  internalGetFederateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private hla.rti1516_2024.fedpro.FederateHandle federate_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.FederateHandle, hla.rti1516_2024.fedpro.FederateHandle.Builder, hla.rti1516_2024.fedpro.FederateHandleOrBuilder> federateBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
     * @return Whether the federate field is set.
     */
    public boolean hasFederate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
     * @return The federate.
     */
    public hla.rti1516_2024.fedpro.FederateHandle getFederate() {
      if (federateBuilder_ == null) {
        return federate_ == null ? hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance() : federate_;
      } else {
        return federateBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
     */
    public Builder setFederate(hla.rti1516_2024.fedpro.FederateHandle value) {
      if (federateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        federate_ = value;
      } else {
        federateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
     */
    public Builder setFederate(
        hla.rti1516_2024.fedpro.FederateHandle.Builder builderForValue) {
      if (federateBuilder_ == null) {
        federate_ = builderForValue.build();
      } else {
        federateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
     */
    public Builder mergeFederate(hla.rti1516_2024.fedpro.FederateHandle value) {
      if (federateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          federate_ != null &&
          federate_ != hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance()) {
          getFederateBuilder().mergeFrom(value);
        } else {
          federate_ = value;
        }
      } else {
        federateBuilder_.mergeFrom(value);
      }
      if (federate_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
     */
    public Builder clearFederate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      federate_ = null;
      if (federateBuilder_ != null) {
        federateBuilder_.dispose();
        federateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandle.Builder getFederateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetFederateFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandleOrBuilder getFederateOrBuilder() {
      if (federateBuilder_ != null) {
        return federateBuilder_.getMessageOrBuilder();
      } else {
        return federate_ == null ?
            hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance() : federate_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle federate = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.FederateHandle, hla.rti1516_2024.fedpro.FederateHandle.Builder, hla.rti1516_2024.fedpro.FederateHandleOrBuilder> 
        internalGetFederateFieldBuilder() {
      if (federateBuilder_ == null) {
        federateBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.FederateHandle, hla.rti1516_2024.fedpro.FederateHandle.Builder, hla.rti1516_2024.fedpro.FederateHandleOrBuilder>(
                getFederate(),
                getParentForChildren(),
                isClean());
        federate_ = null;
      }
      return federateBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.GetFederateNameRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.GetFederateNameRequest)
  private static final hla.rti1516_2024.fedpro.GetFederateNameRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.GetFederateNameRequest();
  }

  public static hla.rti1516_2024.fedpro.GetFederateNameRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFederateNameRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetFederateNameRequest>() {
    @java.lang.Override
    public GetFederateNameRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetFederateNameRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFederateNameRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.GetFederateNameRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

