// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.CommitRegionModificationsRequest}
 */
public final class CommitRegionModificationsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.CommitRegionModificationsRequest)
    CommitRegionModificationsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      CommitRegionModificationsRequest.class.getName());
  }
  // Use CommitRegionModificationsRequest.newBuilder() to construct.
  private CommitRegionModificationsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CommitRegionModificationsRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_CommitRegionModificationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_CommitRegionModificationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.CommitRegionModificationsRequest.class, hla.rti1516_2024.fedpro.CommitRegionModificationsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int REGIONS_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.RegionHandleSet regions_;
  /**
   * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
   * @return Whether the regions field is set.
   */
  @java.lang.Override
  public boolean hasRegions() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
   * @return The regions.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.RegionHandleSet getRegions() {
    return regions_ == null ? hla.rti1516_2024.fedpro.RegionHandleSet.getDefaultInstance() : regions_;
  }
  /**
   * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.RegionHandleSetOrBuilder getRegionsOrBuilder() {
    return regions_ == null ? hla.rti1516_2024.fedpro.RegionHandleSet.getDefaultInstance() : regions_;
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
      output.writeMessage(1, getRegions());
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
        .computeMessageSize(1, getRegions());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.CommitRegionModificationsRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.CommitRegionModificationsRequest other = (hla.rti1516_2024.fedpro.CommitRegionModificationsRequest) obj;

    if (hasRegions() != other.hasRegions()) return false;
    if (hasRegions()) {
      if (!getRegions()
          .equals(other.getRegions())) return false;
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
    if (hasRegions()) {
      hash = (37 * hash) + REGIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRegions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.CommitRegionModificationsRequest prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.CommitRegionModificationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.CommitRegionModificationsRequest)
      hla.rti1516_2024.fedpro.CommitRegionModificationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_CommitRegionModificationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_CommitRegionModificationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.CommitRegionModificationsRequest.class, hla.rti1516_2024.fedpro.CommitRegionModificationsRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.CommitRegionModificationsRequest.newBuilder()
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
        internalGetRegionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      regions_ = null;
      if (regionsBuilder_ != null) {
        regionsBuilder_.dispose();
        regionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_CommitRegionModificationsRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.CommitRegionModificationsRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.CommitRegionModificationsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.CommitRegionModificationsRequest build() {
      hla.rti1516_2024.fedpro.CommitRegionModificationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.CommitRegionModificationsRequest buildPartial() {
      hla.rti1516_2024.fedpro.CommitRegionModificationsRequest result = new hla.rti1516_2024.fedpro.CommitRegionModificationsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.CommitRegionModificationsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.regions_ = regionsBuilder_ == null
            ? regions_
            : regionsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.CommitRegionModificationsRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.CommitRegionModificationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.CommitRegionModificationsRequest other) {
      if (other == hla.rti1516_2024.fedpro.CommitRegionModificationsRequest.getDefaultInstance()) return this;
      if (other.hasRegions()) {
        mergeRegions(other.getRegions());
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
                  internalGetRegionsFieldBuilder().getBuilder(),
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

    private hla.rti1516_2024.fedpro.RegionHandleSet regions_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.RegionHandleSet, hla.rti1516_2024.fedpro.RegionHandleSet.Builder, hla.rti1516_2024.fedpro.RegionHandleSetOrBuilder> regionsBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
     * @return Whether the regions field is set.
     */
    public boolean hasRegions() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
     * @return The regions.
     */
    public hla.rti1516_2024.fedpro.RegionHandleSet getRegions() {
      if (regionsBuilder_ == null) {
        return regions_ == null ? hla.rti1516_2024.fedpro.RegionHandleSet.getDefaultInstance() : regions_;
      } else {
        return regionsBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
     */
    public Builder setRegions(hla.rti1516_2024.fedpro.RegionHandleSet value) {
      if (regionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        regions_ = value;
      } else {
        regionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
     */
    public Builder setRegions(
        hla.rti1516_2024.fedpro.RegionHandleSet.Builder builderForValue) {
      if (regionsBuilder_ == null) {
        regions_ = builderForValue.build();
      } else {
        regionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
     */
    public Builder mergeRegions(hla.rti1516_2024.fedpro.RegionHandleSet value) {
      if (regionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          regions_ != null &&
          regions_ != hla.rti1516_2024.fedpro.RegionHandleSet.getDefaultInstance()) {
          getRegionsBuilder().mergeFrom(value);
        } else {
          regions_ = value;
        }
      } else {
        regionsBuilder_.mergeFrom(value);
      }
      if (regions_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
     */
    public Builder clearRegions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      regions_ = null;
      if (regionsBuilder_ != null) {
        regionsBuilder_.dispose();
        regionsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
     */
    public hla.rti1516_2024.fedpro.RegionHandleSet.Builder getRegionsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetRegionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
     */
    public hla.rti1516_2024.fedpro.RegionHandleSetOrBuilder getRegionsOrBuilder() {
      if (regionsBuilder_ != null) {
        return regionsBuilder_.getMessageOrBuilder();
      } else {
        return regions_ == null ?
            hla.rti1516_2024.fedpro.RegionHandleSet.getDefaultInstance() : regions_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.RegionHandleSet, hla.rti1516_2024.fedpro.RegionHandleSet.Builder, hla.rti1516_2024.fedpro.RegionHandleSetOrBuilder> 
        internalGetRegionsFieldBuilder() {
      if (regionsBuilder_ == null) {
        regionsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.RegionHandleSet, hla.rti1516_2024.fedpro.RegionHandleSet.Builder, hla.rti1516_2024.fedpro.RegionHandleSetOrBuilder>(
                getRegions(),
                getParentForChildren(),
                isClean());
        regions_ = null;
      }
      return regionsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.CommitRegionModificationsRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.CommitRegionModificationsRequest)
  private static final hla.rti1516_2024.fedpro.CommitRegionModificationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.CommitRegionModificationsRequest();
  }

  public static hla.rti1516_2024.fedpro.CommitRegionModificationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitRegionModificationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<CommitRegionModificationsRequest>() {
    @java.lang.Override
    public CommitRegionModificationsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommitRegionModificationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitRegionModificationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.CommitRegionModificationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

