// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.GetDimensionHandleSetRequest}
 */
public final class GetDimensionHandleSetRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.GetDimensionHandleSetRequest)
    GetDimensionHandleSetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      GetDimensionHandleSetRequest.class.getName());
  }
  // Use GetDimensionHandleSetRequest.newBuilder() to construct.
  private GetDimensionHandleSetRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetDimensionHandleSetRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetDimensionHandleSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetDimensionHandleSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest.class, hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int REGION_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.RegionHandle region_;
  /**
   * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
   * @return Whether the region field is set.
   */
  @java.lang.Override
  public boolean hasRegion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
   * @return The region.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.RegionHandle getRegion() {
    return region_ == null ? hla.rti1516_2024.fedpro.RegionHandle.getDefaultInstance() : region_;
  }
  /**
   * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.RegionHandleOrBuilder getRegionOrBuilder() {
    return region_ == null ? hla.rti1516_2024.fedpro.RegionHandle.getDefaultInstance() : region_;
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
      output.writeMessage(1, getRegion());
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
        .computeMessageSize(1, getRegion());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest other = (hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest) obj;

    if (hasRegion() != other.hasRegion()) return false;
    if (hasRegion()) {
      if (!getRegion()
          .equals(other.getRegion())) return false;
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
    if (hasRegion()) {
      hash = (37 * hash) + REGION_FIELD_NUMBER;
      hash = (53 * hash) + getRegion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.GetDimensionHandleSetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.GetDimensionHandleSetRequest)
      hla.rti1516_2024.fedpro.GetDimensionHandleSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetDimensionHandleSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetDimensionHandleSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest.class, hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest.newBuilder()
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
        internalGetRegionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      region_ = null;
      if (regionBuilder_ != null) {
        regionBuilder_.dispose();
        regionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetDimensionHandleSetRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest build() {
      hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest buildPartial() {
      hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest result = new hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.region_ = regionBuilder_ == null
            ? region_
            : regionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest other) {
      if (other == hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest.getDefaultInstance()) return this;
      if (other.hasRegion()) {
        mergeRegion(other.getRegion());
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
                  internalGetRegionFieldBuilder().getBuilder(),
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

    private hla.rti1516_2024.fedpro.RegionHandle region_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.RegionHandle, hla.rti1516_2024.fedpro.RegionHandle.Builder, hla.rti1516_2024.fedpro.RegionHandleOrBuilder> regionBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
     * @return Whether the region field is set.
     */
    public boolean hasRegion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
     * @return The region.
     */
    public hla.rti1516_2024.fedpro.RegionHandle getRegion() {
      if (regionBuilder_ == null) {
        return region_ == null ? hla.rti1516_2024.fedpro.RegionHandle.getDefaultInstance() : region_;
      } else {
        return regionBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
     */
    public Builder setRegion(hla.rti1516_2024.fedpro.RegionHandle value) {
      if (regionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        region_ = value;
      } else {
        regionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
     */
    public Builder setRegion(
        hla.rti1516_2024.fedpro.RegionHandle.Builder builderForValue) {
      if (regionBuilder_ == null) {
        region_ = builderForValue.build();
      } else {
        regionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
     */
    public Builder mergeRegion(hla.rti1516_2024.fedpro.RegionHandle value) {
      if (regionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          region_ != null &&
          region_ != hla.rti1516_2024.fedpro.RegionHandle.getDefaultInstance()) {
          getRegionBuilder().mergeFrom(value);
        } else {
          region_ = value;
        }
      } else {
        regionBuilder_.mergeFrom(value);
      }
      if (region_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
     */
    public Builder clearRegion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      region_ = null;
      if (regionBuilder_ != null) {
        regionBuilder_.dispose();
        regionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
     */
    public hla.rti1516_2024.fedpro.RegionHandle.Builder getRegionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetRegionFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
     */
    public hla.rti1516_2024.fedpro.RegionHandleOrBuilder getRegionOrBuilder() {
      if (regionBuilder_ != null) {
        return regionBuilder_.getMessageOrBuilder();
      } else {
        return region_ == null ?
            hla.rti1516_2024.fedpro.RegionHandle.getDefaultInstance() : region_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandle region = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.RegionHandle, hla.rti1516_2024.fedpro.RegionHandle.Builder, hla.rti1516_2024.fedpro.RegionHandleOrBuilder> 
        internalGetRegionFieldBuilder() {
      if (regionBuilder_ == null) {
        regionBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.RegionHandle, hla.rti1516_2024.fedpro.RegionHandle.Builder, hla.rti1516_2024.fedpro.RegionHandleOrBuilder>(
                getRegion(),
                getParentForChildren(),
                isClean());
        region_ = null;
      }
      return regionBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.GetDimensionHandleSetRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.GetDimensionHandleSetRequest)
  private static final hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest();
  }

  public static hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDimensionHandleSetRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetDimensionHandleSetRequest>() {
    @java.lang.Override
    public GetDimensionHandleSetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDimensionHandleSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDimensionHandleSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.GetDimensionHandleSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

