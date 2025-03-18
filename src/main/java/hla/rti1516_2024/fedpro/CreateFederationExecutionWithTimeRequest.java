// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest}
 */
public final class CreateFederationExecutionWithTimeRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest)
    CreateFederationExecutionWithTimeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      CreateFederationExecutionWithTimeRequest.class.getName());
  }
  // Use CreateFederationExecutionWithTimeRequest.newBuilder() to construct.
  private CreateFederationExecutionWithTimeRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateFederationExecutionWithTimeRequest() {
    federationName_ = "";
    logicalTimeImplementationName_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_CreateFederationExecutionWithTimeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_CreateFederationExecutionWithTimeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest.class, hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FEDERATIONNAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object federationName_ = "";
  /**
   * <code>string federationName = 1;</code>
   * @return The federationName.
   */
  @java.lang.Override
  public java.lang.String getFederationName() {
    java.lang.Object ref = federationName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      federationName_ = s;
      return s;
    }
  }
  /**
   * <code>string federationName = 1;</code>
   * @return The bytes for federationName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFederationNameBytes() {
    java.lang.Object ref = federationName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      federationName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FOMMODULE_FIELD_NUMBER = 2;
  private hla.rti1516_2024.fedpro.FomModule fomModule_;
  /**
   * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
   * @return Whether the fomModule field is set.
   */
  @java.lang.Override
  public boolean hasFomModule() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
   * @return The fomModule.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.FomModule getFomModule() {
    return fomModule_ == null ? hla.rti1516_2024.fedpro.FomModule.getDefaultInstance() : fomModule_;
  }
  /**
   * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.FomModuleOrBuilder getFomModuleOrBuilder() {
    return fomModule_ == null ? hla.rti1516_2024.fedpro.FomModule.getDefaultInstance() : fomModule_;
  }

  public static final int LOGICALTIMEIMPLEMENTATIONNAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object logicalTimeImplementationName_ = "";
  /**
   * <code>string logicalTimeImplementationName = 3;</code>
   * @return The logicalTimeImplementationName.
   */
  @java.lang.Override
  public java.lang.String getLogicalTimeImplementationName() {
    java.lang.Object ref = logicalTimeImplementationName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logicalTimeImplementationName_ = s;
      return s;
    }
  }
  /**
   * <code>string logicalTimeImplementationName = 3;</code>
   * @return The bytes for logicalTimeImplementationName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogicalTimeImplementationNameBytes() {
    java.lang.Object ref = logicalTimeImplementationName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logicalTimeImplementationName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(federationName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, federationName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getFomModule());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(logicalTimeImplementationName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, logicalTimeImplementationName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(federationName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, federationName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFomModule());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(logicalTimeImplementationName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, logicalTimeImplementationName_);
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest other = (hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest) obj;

    if (!getFederationName()
        .equals(other.getFederationName())) return false;
    if (hasFomModule() != other.hasFomModule()) return false;
    if (hasFomModule()) {
      if (!getFomModule()
          .equals(other.getFomModule())) return false;
    }
    if (!getLogicalTimeImplementationName()
        .equals(other.getLogicalTimeImplementationName())) return false;
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
    hash = (37 * hash) + FEDERATIONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFederationName().hashCode();
    if (hasFomModule()) {
      hash = (37 * hash) + FOMMODULE_FIELD_NUMBER;
      hash = (53 * hash) + getFomModule().hashCode();
    }
    hash = (37 * hash) + LOGICALTIMEIMPLEMENTATIONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLogicalTimeImplementationName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest)
      hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_CreateFederationExecutionWithTimeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_CreateFederationExecutionWithTimeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest.class, hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest.newBuilder()
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
        internalGetFomModuleFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      federationName_ = "";
      fomModule_ = null;
      if (fomModuleBuilder_ != null) {
        fomModuleBuilder_.dispose();
        fomModuleBuilder_ = null;
      }
      logicalTimeImplementationName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_CreateFederationExecutionWithTimeRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest build() {
      hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest buildPartial() {
      hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest result = new hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.federationName_ = federationName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fomModule_ = fomModuleBuilder_ == null
            ? fomModule_
            : fomModuleBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.logicalTimeImplementationName_ = logicalTimeImplementationName_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest other) {
      if (other == hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest.getDefaultInstance()) return this;
      if (!other.getFederationName().isEmpty()) {
        federationName_ = other.federationName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasFomModule()) {
        mergeFomModule(other.getFomModule());
      }
      if (!other.getLogicalTimeImplementationName().isEmpty()) {
        logicalTimeImplementationName_ = other.logicalTimeImplementationName_;
        bitField0_ |= 0x00000004;
        onChanged();
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
              federationName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  internalGetFomModuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              logicalTimeImplementationName_ = input.readStringRequireUtf8();
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

    private java.lang.Object federationName_ = "";
    /**
     * <code>string federationName = 1;</code>
     * @return The federationName.
     */
    public java.lang.String getFederationName() {
      java.lang.Object ref = federationName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        federationName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string federationName = 1;</code>
     * @return The bytes for federationName.
     */
    public com.google.protobuf.ByteString
        getFederationNameBytes() {
      java.lang.Object ref = federationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        federationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string federationName = 1;</code>
     * @param value The federationName to set.
     * @return This builder for chaining.
     */
    public Builder setFederationName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      federationName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string federationName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFederationName() {
      federationName_ = getDefaultInstance().getFederationName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string federationName = 1;</code>
     * @param value The bytes for federationName to set.
     * @return This builder for chaining.
     */
    public Builder setFederationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      federationName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private hla.rti1516_2024.fedpro.FomModule fomModule_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.FomModule, hla.rti1516_2024.fedpro.FomModule.Builder, hla.rti1516_2024.fedpro.FomModuleOrBuilder> fomModuleBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
     * @return Whether the fomModule field is set.
     */
    public boolean hasFomModule() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
     * @return The fomModule.
     */
    public hla.rti1516_2024.fedpro.FomModule getFomModule() {
      if (fomModuleBuilder_ == null) {
        return fomModule_ == null ? hla.rti1516_2024.fedpro.FomModule.getDefaultInstance() : fomModule_;
      } else {
        return fomModuleBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
     */
    public Builder setFomModule(hla.rti1516_2024.fedpro.FomModule value) {
      if (fomModuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fomModule_ = value;
      } else {
        fomModuleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
     */
    public Builder setFomModule(
        hla.rti1516_2024.fedpro.FomModule.Builder builderForValue) {
      if (fomModuleBuilder_ == null) {
        fomModule_ = builderForValue.build();
      } else {
        fomModuleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
     */
    public Builder mergeFomModule(hla.rti1516_2024.fedpro.FomModule value) {
      if (fomModuleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          fomModule_ != null &&
          fomModule_ != hla.rti1516_2024.fedpro.FomModule.getDefaultInstance()) {
          getFomModuleBuilder().mergeFrom(value);
        } else {
          fomModule_ = value;
        }
      } else {
        fomModuleBuilder_.mergeFrom(value);
      }
      if (fomModule_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
     */
    public Builder clearFomModule() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fomModule_ = null;
      if (fomModuleBuilder_ != null) {
        fomModuleBuilder_.dispose();
        fomModuleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
     */
    public hla.rti1516_2024.fedpro.FomModule.Builder getFomModuleBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return internalGetFomModuleFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
     */
    public hla.rti1516_2024.fedpro.FomModuleOrBuilder getFomModuleOrBuilder() {
      if (fomModuleBuilder_ != null) {
        return fomModuleBuilder_.getMessageOrBuilder();
      } else {
        return fomModule_ == null ?
            hla.rti1516_2024.fedpro.FomModule.getDefaultInstance() : fomModule_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.FomModule fomModule = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.FomModule, hla.rti1516_2024.fedpro.FomModule.Builder, hla.rti1516_2024.fedpro.FomModuleOrBuilder> 
        internalGetFomModuleFieldBuilder() {
      if (fomModuleBuilder_ == null) {
        fomModuleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.FomModule, hla.rti1516_2024.fedpro.FomModule.Builder, hla.rti1516_2024.fedpro.FomModuleOrBuilder>(
                getFomModule(),
                getParentForChildren(),
                isClean());
        fomModule_ = null;
      }
      return fomModuleBuilder_;
    }

    private java.lang.Object logicalTimeImplementationName_ = "";
    /**
     * <code>string logicalTimeImplementationName = 3;</code>
     * @return The logicalTimeImplementationName.
     */
    public java.lang.String getLogicalTimeImplementationName() {
      java.lang.Object ref = logicalTimeImplementationName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logicalTimeImplementationName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string logicalTimeImplementationName = 3;</code>
     * @return The bytes for logicalTimeImplementationName.
     */
    public com.google.protobuf.ByteString
        getLogicalTimeImplementationNameBytes() {
      java.lang.Object ref = logicalTimeImplementationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logicalTimeImplementationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string logicalTimeImplementationName = 3;</code>
     * @param value The logicalTimeImplementationName to set.
     * @return This builder for chaining.
     */
    public Builder setLogicalTimeImplementationName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      logicalTimeImplementationName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string logicalTimeImplementationName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogicalTimeImplementationName() {
      logicalTimeImplementationName_ = getDefaultInstance().getLogicalTimeImplementationName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string logicalTimeImplementationName = 3;</code>
     * @param value The bytes for logicalTimeImplementationName to set.
     * @return This builder for chaining.
     */
    public Builder setLogicalTimeImplementationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      logicalTimeImplementationName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest)
  private static final hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest();
  }

  public static hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFederationExecutionWithTimeRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateFederationExecutionWithTimeRequest>() {
    @java.lang.Override
    public CreateFederationExecutionWithTimeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateFederationExecutionWithTimeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFederationExecutionWithTimeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.CreateFederationExecutionWithTimeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

