// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: datatypes.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.SupplementalReflectInfo}
 */
public final class SupplementalReflectInfo extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.SupplementalReflectInfo)
    SupplementalReflectInfoOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      SupplementalReflectInfo.class.getName());
  }
  // Use SupplementalReflectInfo.newBuilder() to construct.
  private SupplementalReflectInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SupplementalReflectInfo() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_SupplementalReflectInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_SupplementalReflectInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.SupplementalReflectInfo.class, hla.rti1516_2024.fedpro.SupplementalReflectInfo.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCINGFEDERATE_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.FederateHandle producingFederate_;
  /**
   * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
   * @return Whether the producingFederate field is set.
   */
  @java.lang.Override
  public boolean hasProducingFederate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
   * @return The producingFederate.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.FederateHandle getProducingFederate() {
    return producingFederate_ == null ? hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance() : producingFederate_;
  }
  /**
   * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.FederateHandleOrBuilder getProducingFederateOrBuilder() {
    return producingFederate_ == null ? hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance() : producingFederate_;
  }

  public static final int CONVEYEDREGIONSISVALID_FIELD_NUMBER = 2;
  private boolean conveyedRegionsIsValid_ = false;
  /**
   * <code>bool conveyedRegionsIsValid = 2;</code>
   * @return The conveyedRegionsIsValid.
   */
  @java.lang.Override
  public boolean getConveyedRegionsIsValid() {
    return conveyedRegionsIsValid_;
  }

  public static final int CONVEYEDREGIONS_FIELD_NUMBER = 3;
  private hla.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions_;
  /**
   * <pre>
   * optional, only valid if conveyedRegionsIsValid == true
   * </pre>
   *
   * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
   * @return Whether the conveyedRegions field is set.
   */
  @java.lang.Override
  public boolean hasConveyedRegions() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * optional, only valid if conveyedRegionsIsValid == true
   * </pre>
   *
   * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
   * @return The conveyedRegions.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.ConveyedRegionSet getConveyedRegions() {
    return conveyedRegions_ == null ? hla.rti1516_2024.fedpro.ConveyedRegionSet.getDefaultInstance() : conveyedRegions_;
  }
  /**
   * <pre>
   * optional, only valid if conveyedRegionsIsValid == true
   * </pre>
   *
   * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.ConveyedRegionSetOrBuilder getConveyedRegionsOrBuilder() {
    return conveyedRegions_ == null ? hla.rti1516_2024.fedpro.ConveyedRegionSet.getDefaultInstance() : conveyedRegions_;
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
      output.writeMessage(1, getProducingFederate());
    }
    if (conveyedRegionsIsValid_ != false) {
      output.writeBool(2, conveyedRegionsIsValid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getConveyedRegions());
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
        .computeMessageSize(1, getProducingFederate());
    }
    if (conveyedRegionsIsValid_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, conveyedRegionsIsValid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getConveyedRegions());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.SupplementalReflectInfo)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.SupplementalReflectInfo other = (hla.rti1516_2024.fedpro.SupplementalReflectInfo) obj;

    if (hasProducingFederate() != other.hasProducingFederate()) return false;
    if (hasProducingFederate()) {
      if (!getProducingFederate()
          .equals(other.getProducingFederate())) return false;
    }
    if (getConveyedRegionsIsValid()
        != other.getConveyedRegionsIsValid()) return false;
    if (hasConveyedRegions() != other.hasConveyedRegions()) return false;
    if (hasConveyedRegions()) {
      if (!getConveyedRegions()
          .equals(other.getConveyedRegions())) return false;
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
    if (hasProducingFederate()) {
      hash = (37 * hash) + PRODUCINGFEDERATE_FIELD_NUMBER;
      hash = (53 * hash) + getProducingFederate().hashCode();
    }
    hash = (37 * hash) + CONVEYEDREGIONSISVALID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getConveyedRegionsIsValid());
    if (hasConveyedRegions()) {
      hash = (37 * hash) + CONVEYEDREGIONS_FIELD_NUMBER;
      hash = (53 * hash) + getConveyedRegions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.SupplementalReflectInfo prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.SupplementalReflectInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.SupplementalReflectInfo)
      hla.rti1516_2024.fedpro.SupplementalReflectInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_SupplementalReflectInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_SupplementalReflectInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.SupplementalReflectInfo.class, hla.rti1516_2024.fedpro.SupplementalReflectInfo.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.SupplementalReflectInfo.newBuilder()
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
        internalGetProducingFederateFieldBuilder();
        internalGetConveyedRegionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      producingFederate_ = null;
      if (producingFederateBuilder_ != null) {
        producingFederateBuilder_.dispose();
        producingFederateBuilder_ = null;
      }
      conveyedRegionsIsValid_ = false;
      conveyedRegions_ = null;
      if (conveyedRegionsBuilder_ != null) {
        conveyedRegionsBuilder_.dispose();
        conveyedRegionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_SupplementalReflectInfo_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.SupplementalReflectInfo getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.SupplementalReflectInfo.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.SupplementalReflectInfo build() {
      hla.rti1516_2024.fedpro.SupplementalReflectInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.SupplementalReflectInfo buildPartial() {
      hla.rti1516_2024.fedpro.SupplementalReflectInfo result = new hla.rti1516_2024.fedpro.SupplementalReflectInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.SupplementalReflectInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.producingFederate_ = producingFederateBuilder_ == null
            ? producingFederate_
            : producingFederateBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.conveyedRegionsIsValid_ = conveyedRegionsIsValid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.conveyedRegions_ = conveyedRegionsBuilder_ == null
            ? conveyedRegions_
            : conveyedRegionsBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.SupplementalReflectInfo) {
        return mergeFrom((hla.rti1516_2024.fedpro.SupplementalReflectInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.SupplementalReflectInfo other) {
      if (other == hla.rti1516_2024.fedpro.SupplementalReflectInfo.getDefaultInstance()) return this;
      if (other.hasProducingFederate()) {
        mergeProducingFederate(other.getProducingFederate());
      }
      if (other.getConveyedRegionsIsValid() != false) {
        setConveyedRegionsIsValid(other.getConveyedRegionsIsValid());
      }
      if (other.hasConveyedRegions()) {
        mergeConveyedRegions(other.getConveyedRegions());
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
                  internalGetProducingFederateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              conveyedRegionsIsValid_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  internalGetConveyedRegionsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private hla.rti1516_2024.fedpro.FederateHandle producingFederate_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.FederateHandle, hla.rti1516_2024.fedpro.FederateHandle.Builder, hla.rti1516_2024.fedpro.FederateHandleOrBuilder> producingFederateBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
     * @return Whether the producingFederate field is set.
     */
    public boolean hasProducingFederate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
     * @return The producingFederate.
     */
    public hla.rti1516_2024.fedpro.FederateHandle getProducingFederate() {
      if (producingFederateBuilder_ == null) {
        return producingFederate_ == null ? hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance() : producingFederate_;
      } else {
        return producingFederateBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
     */
    public Builder setProducingFederate(hla.rti1516_2024.fedpro.FederateHandle value) {
      if (producingFederateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        producingFederate_ = value;
      } else {
        producingFederateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
     */
    public Builder setProducingFederate(
        hla.rti1516_2024.fedpro.FederateHandle.Builder builderForValue) {
      if (producingFederateBuilder_ == null) {
        producingFederate_ = builderForValue.build();
      } else {
        producingFederateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
     */
    public Builder mergeProducingFederate(hla.rti1516_2024.fedpro.FederateHandle value) {
      if (producingFederateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          producingFederate_ != null &&
          producingFederate_ != hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance()) {
          getProducingFederateBuilder().mergeFrom(value);
        } else {
          producingFederate_ = value;
        }
      } else {
        producingFederateBuilder_.mergeFrom(value);
      }
      if (producingFederate_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
     */
    public Builder clearProducingFederate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      producingFederate_ = null;
      if (producingFederateBuilder_ != null) {
        producingFederateBuilder_.dispose();
        producingFederateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandle.Builder getProducingFederateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetProducingFederateFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandleOrBuilder getProducingFederateOrBuilder() {
      if (producingFederateBuilder_ != null) {
        return producingFederateBuilder_.getMessageOrBuilder();
      } else {
        return producingFederate_ == null ?
            hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance() : producingFederate_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.FederateHandle, hla.rti1516_2024.fedpro.FederateHandle.Builder, hla.rti1516_2024.fedpro.FederateHandleOrBuilder> 
        internalGetProducingFederateFieldBuilder() {
      if (producingFederateBuilder_ == null) {
        producingFederateBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.FederateHandle, hla.rti1516_2024.fedpro.FederateHandle.Builder, hla.rti1516_2024.fedpro.FederateHandleOrBuilder>(
                getProducingFederate(),
                getParentForChildren(),
                isClean());
        producingFederate_ = null;
      }
      return producingFederateBuilder_;
    }

    private boolean conveyedRegionsIsValid_ ;
    /**
     * <code>bool conveyedRegionsIsValid = 2;</code>
     * @return The conveyedRegionsIsValid.
     */
    @java.lang.Override
    public boolean getConveyedRegionsIsValid() {
      return conveyedRegionsIsValid_;
    }
    /**
     * <code>bool conveyedRegionsIsValid = 2;</code>
     * @param value The conveyedRegionsIsValid to set.
     * @return This builder for chaining.
     */
    public Builder setConveyedRegionsIsValid(boolean value) {

      conveyedRegionsIsValid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool conveyedRegionsIsValid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearConveyedRegionsIsValid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      conveyedRegionsIsValid_ = false;
      onChanged();
      return this;
    }

    private hla.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.ConveyedRegionSet, hla.rti1516_2024.fedpro.ConveyedRegionSet.Builder, hla.rti1516_2024.fedpro.ConveyedRegionSetOrBuilder> conveyedRegionsBuilder_;
    /**
     * <pre>
     * optional, only valid if conveyedRegionsIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
     * @return Whether the conveyedRegions field is set.
     */
    public boolean hasConveyedRegions() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * optional, only valid if conveyedRegionsIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
     * @return The conveyedRegions.
     */
    public hla.rti1516_2024.fedpro.ConveyedRegionSet getConveyedRegions() {
      if (conveyedRegionsBuilder_ == null) {
        return conveyedRegions_ == null ? hla.rti1516_2024.fedpro.ConveyedRegionSet.getDefaultInstance() : conveyedRegions_;
      } else {
        return conveyedRegionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * optional, only valid if conveyedRegionsIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
     */
    public Builder setConveyedRegions(hla.rti1516_2024.fedpro.ConveyedRegionSet value) {
      if (conveyedRegionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conveyedRegions_ = value;
      } else {
        conveyedRegionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional, only valid if conveyedRegionsIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
     */
    public Builder setConveyedRegions(
        hla.rti1516_2024.fedpro.ConveyedRegionSet.Builder builderForValue) {
      if (conveyedRegionsBuilder_ == null) {
        conveyedRegions_ = builderForValue.build();
      } else {
        conveyedRegionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional, only valid if conveyedRegionsIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
     */
    public Builder mergeConveyedRegions(hla.rti1516_2024.fedpro.ConveyedRegionSet value) {
      if (conveyedRegionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          conveyedRegions_ != null &&
          conveyedRegions_ != hla.rti1516_2024.fedpro.ConveyedRegionSet.getDefaultInstance()) {
          getConveyedRegionsBuilder().mergeFrom(value);
        } else {
          conveyedRegions_ = value;
        }
      } else {
        conveyedRegionsBuilder_.mergeFrom(value);
      }
      if (conveyedRegions_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * optional, only valid if conveyedRegionsIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
     */
    public Builder clearConveyedRegions() {
      bitField0_ = (bitField0_ & ~0x00000004);
      conveyedRegions_ = null;
      if (conveyedRegionsBuilder_ != null) {
        conveyedRegionsBuilder_.dispose();
        conveyedRegionsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional, only valid if conveyedRegionsIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
     */
    public hla.rti1516_2024.fedpro.ConveyedRegionSet.Builder getConveyedRegionsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return internalGetConveyedRegionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * optional, only valid if conveyedRegionsIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
     */
    public hla.rti1516_2024.fedpro.ConveyedRegionSetOrBuilder getConveyedRegionsOrBuilder() {
      if (conveyedRegionsBuilder_ != null) {
        return conveyedRegionsBuilder_.getMessageOrBuilder();
      } else {
        return conveyedRegions_ == null ?
            hla.rti1516_2024.fedpro.ConveyedRegionSet.getDefaultInstance() : conveyedRegions_;
      }
    }
    /**
     * <pre>
     * optional, only valid if conveyedRegionsIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.ConveyedRegionSet conveyedRegions = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.ConveyedRegionSet, hla.rti1516_2024.fedpro.ConveyedRegionSet.Builder, hla.rti1516_2024.fedpro.ConveyedRegionSetOrBuilder> 
        internalGetConveyedRegionsFieldBuilder() {
      if (conveyedRegionsBuilder_ == null) {
        conveyedRegionsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.ConveyedRegionSet, hla.rti1516_2024.fedpro.ConveyedRegionSet.Builder, hla.rti1516_2024.fedpro.ConveyedRegionSetOrBuilder>(
                getConveyedRegions(),
                getParentForChildren(),
                isClean());
        conveyedRegions_ = null;
      }
      return conveyedRegionsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.SupplementalReflectInfo)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.SupplementalReflectInfo)
  private static final hla.rti1516_2024.fedpro.SupplementalReflectInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.SupplementalReflectInfo();
  }

  public static hla.rti1516_2024.fedpro.SupplementalReflectInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SupplementalReflectInfo>
      PARSER = new com.google.protobuf.AbstractParser<SupplementalReflectInfo>() {
    @java.lang.Override
    public SupplementalReflectInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<SupplementalReflectInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SupplementalReflectInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.SupplementalReflectInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

