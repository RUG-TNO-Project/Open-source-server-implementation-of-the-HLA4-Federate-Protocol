// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.GetDimensionNameRequest}
 */
public final class GetDimensionNameRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.GetDimensionNameRequest)
    GetDimensionNameRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      GetDimensionNameRequest.class.getName());
  }
  // Use GetDimensionNameRequest.newBuilder() to construct.
  private GetDimensionNameRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetDimensionNameRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetDimensionNameRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetDimensionNameRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.GetDimensionNameRequest.class, hla.rti1516_2024.fedpro.GetDimensionNameRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DIMENSION_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.DimensionHandle dimension_;
  /**
   * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
   * @return Whether the dimension field is set.
   */
  @java.lang.Override
  public boolean hasDimension() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
   * @return The dimension.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.DimensionHandle getDimension() {
    return dimension_ == null ? hla.rti1516_2024.fedpro.DimensionHandle.getDefaultInstance() : dimension_;
  }
  /**
   * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.DimensionHandleOrBuilder getDimensionOrBuilder() {
    return dimension_ == null ? hla.rti1516_2024.fedpro.DimensionHandle.getDefaultInstance() : dimension_;
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
      output.writeMessage(1, getDimension());
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
        .computeMessageSize(1, getDimension());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.GetDimensionNameRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.GetDimensionNameRequest other = (hla.rti1516_2024.fedpro.GetDimensionNameRequest) obj;

    if (hasDimension() != other.hasDimension()) return false;
    if (hasDimension()) {
      if (!getDimension()
          .equals(other.getDimension())) return false;
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
    if (hasDimension()) {
      hash = (37 * hash) + DIMENSION_FIELD_NUMBER;
      hash = (53 * hash) + getDimension().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.GetDimensionNameRequest prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.GetDimensionNameRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.GetDimensionNameRequest)
      hla.rti1516_2024.fedpro.GetDimensionNameRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetDimensionNameRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetDimensionNameRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.GetDimensionNameRequest.class, hla.rti1516_2024.fedpro.GetDimensionNameRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.GetDimensionNameRequest.newBuilder()
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
        internalGetDimensionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dimension_ = null;
      if (dimensionBuilder_ != null) {
        dimensionBuilder_.dispose();
        dimensionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetDimensionNameRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetDimensionNameRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.GetDimensionNameRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetDimensionNameRequest build() {
      hla.rti1516_2024.fedpro.GetDimensionNameRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetDimensionNameRequest buildPartial() {
      hla.rti1516_2024.fedpro.GetDimensionNameRequest result = new hla.rti1516_2024.fedpro.GetDimensionNameRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.GetDimensionNameRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dimension_ = dimensionBuilder_ == null
            ? dimension_
            : dimensionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.GetDimensionNameRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.GetDimensionNameRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.GetDimensionNameRequest other) {
      if (other == hla.rti1516_2024.fedpro.GetDimensionNameRequest.getDefaultInstance()) return this;
      if (other.hasDimension()) {
        mergeDimension(other.getDimension());
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
                  internalGetDimensionFieldBuilder().getBuilder(),
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

    private hla.rti1516_2024.fedpro.DimensionHandle dimension_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.DimensionHandle, hla.rti1516_2024.fedpro.DimensionHandle.Builder, hla.rti1516_2024.fedpro.DimensionHandleOrBuilder> dimensionBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
     * @return Whether the dimension field is set.
     */
    public boolean hasDimension() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
     * @return The dimension.
     */
    public hla.rti1516_2024.fedpro.DimensionHandle getDimension() {
      if (dimensionBuilder_ == null) {
        return dimension_ == null ? hla.rti1516_2024.fedpro.DimensionHandle.getDefaultInstance() : dimension_;
      } else {
        return dimensionBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
     */
    public Builder setDimension(hla.rti1516_2024.fedpro.DimensionHandle value) {
      if (dimensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dimension_ = value;
      } else {
        dimensionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
     */
    public Builder setDimension(
        hla.rti1516_2024.fedpro.DimensionHandle.Builder builderForValue) {
      if (dimensionBuilder_ == null) {
        dimension_ = builderForValue.build();
      } else {
        dimensionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
     */
    public Builder mergeDimension(hla.rti1516_2024.fedpro.DimensionHandle value) {
      if (dimensionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dimension_ != null &&
          dimension_ != hla.rti1516_2024.fedpro.DimensionHandle.getDefaultInstance()) {
          getDimensionBuilder().mergeFrom(value);
        } else {
          dimension_ = value;
        }
      } else {
        dimensionBuilder_.mergeFrom(value);
      }
      if (dimension_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
     */
    public Builder clearDimension() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dimension_ = null;
      if (dimensionBuilder_ != null) {
        dimensionBuilder_.dispose();
        dimensionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
     */
    public hla.rti1516_2024.fedpro.DimensionHandle.Builder getDimensionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetDimensionFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
     */
    public hla.rti1516_2024.fedpro.DimensionHandleOrBuilder getDimensionOrBuilder() {
      if (dimensionBuilder_ != null) {
        return dimensionBuilder_.getMessageOrBuilder();
      } else {
        return dimension_ == null ?
            hla.rti1516_2024.fedpro.DimensionHandle.getDefaultInstance() : dimension_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.DimensionHandle dimension = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.DimensionHandle, hla.rti1516_2024.fedpro.DimensionHandle.Builder, hla.rti1516_2024.fedpro.DimensionHandleOrBuilder> 
        internalGetDimensionFieldBuilder() {
      if (dimensionBuilder_ == null) {
        dimensionBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.DimensionHandle, hla.rti1516_2024.fedpro.DimensionHandle.Builder, hla.rti1516_2024.fedpro.DimensionHandleOrBuilder>(
                getDimension(),
                getParentForChildren(),
                isClean());
        dimension_ = null;
      }
      return dimensionBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.GetDimensionNameRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.GetDimensionNameRequest)
  private static final hla.rti1516_2024.fedpro.GetDimensionNameRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.GetDimensionNameRequest();
  }

  public static hla.rti1516_2024.fedpro.GetDimensionNameRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDimensionNameRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetDimensionNameRequest>() {
    @java.lang.Override
    public GetDimensionNameRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDimensionNameRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDimensionNameRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.GetDimensionNameRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

