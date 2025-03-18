// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse}
 */
public final class GetAvailableDimensionsForObjectClassResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse)
    GetAvailableDimensionsForObjectClassResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      GetAvailableDimensionsForObjectClassResponse.class.getName());
  }
  // Use GetAvailableDimensionsForObjectClassResponse.newBuilder() to construct.
  private GetAvailableDimensionsForObjectClassResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetAvailableDimensionsForObjectClassResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetAvailableDimensionsForObjectClassResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetAvailableDimensionsForObjectClassResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse.class, hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESULT_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.DimensionHandleSet result_;
  /**
   * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.DimensionHandleSet getResult() {
    return result_ == null ? hla.rti1516_2024.fedpro.DimensionHandleSet.getDefaultInstance() : result_;
  }
  /**
   * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.DimensionHandleSetOrBuilder getResultOrBuilder() {
    return result_ == null ? hla.rti1516_2024.fedpro.DimensionHandleSet.getDefaultInstance() : result_;
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
      output.writeMessage(1, getResult());
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
        .computeMessageSize(1, getResult());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse other = (hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse)
      hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetAvailableDimensionsForObjectClassResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetAvailableDimensionsForObjectClassResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse.class, hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse.newBuilder()
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
        internalGetResultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetAvailableDimensionsForObjectClassResponse_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse build() {
      hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse buildPartial() {
      hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse result = new hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.result_ = resultBuilder_ == null
            ? result_
            : resultBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse) {
        return mergeFrom((hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse other) {
      if (other == hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
                  internalGetResultFieldBuilder().getBuilder(),
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

    private hla.rti1516_2024.fedpro.DimensionHandleSet result_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.DimensionHandleSet, hla.rti1516_2024.fedpro.DimensionHandleSet.Builder, hla.rti1516_2024.fedpro.DimensionHandleSetOrBuilder> resultBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
     * @return The result.
     */
    public hla.rti1516_2024.fedpro.DimensionHandleSet getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? hla.rti1516_2024.fedpro.DimensionHandleSet.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
     */
    public Builder setResult(hla.rti1516_2024.fedpro.DimensionHandleSet value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
     */
    public Builder setResult(
        hla.rti1516_2024.fedpro.DimensionHandleSet.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
     */
    public Builder mergeResult(hla.rti1516_2024.fedpro.DimensionHandleSet value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          result_ != null &&
          result_ != hla.rti1516_2024.fedpro.DimensionHandleSet.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      if (result_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
     */
    public hla.rti1516_2024.fedpro.DimensionHandleSet.Builder getResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
     */
    public hla.rti1516_2024.fedpro.DimensionHandleSetOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            hla.rti1516_2024.fedpro.DimensionHandleSet.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandleSet result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.DimensionHandleSet, hla.rti1516_2024.fedpro.DimensionHandleSet.Builder, hla.rti1516_2024.fedpro.DimensionHandleSetOrBuilder> 
        internalGetResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.DimensionHandleSet, hla.rti1516_2024.fedpro.DimensionHandleSet.Builder, hla.rti1516_2024.fedpro.DimensionHandleSetOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse)
  private static final hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse();
  }

  public static hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAvailableDimensionsForObjectClassResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAvailableDimensionsForObjectClassResponse>() {
    @java.lang.Override
    public GetAvailableDimensionsForObjectClassResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAvailableDimensionsForObjectClassResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAvailableDimensionsForObjectClassResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.GetAvailableDimensionsForObjectClassResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

