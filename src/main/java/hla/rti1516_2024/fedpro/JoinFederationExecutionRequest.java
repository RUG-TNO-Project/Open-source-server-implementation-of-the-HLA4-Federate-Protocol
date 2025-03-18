// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.JoinFederationExecutionRequest}
 */
public final class JoinFederationExecutionRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.JoinFederationExecutionRequest)
    JoinFederationExecutionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      JoinFederationExecutionRequest.class.getName());
  }
  // Use JoinFederationExecutionRequest.newBuilder() to construct.
  private JoinFederationExecutionRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private JoinFederationExecutionRequest() {
    federateType_ = "";
    federationName_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_JoinFederationExecutionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_JoinFederationExecutionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.JoinFederationExecutionRequest.class, hla.rti1516_2024.fedpro.JoinFederationExecutionRequest.Builder.class);
  }

  public static final int FEDERATETYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object federateType_ = "";
  /**
   * <code>string federateType = 1;</code>
   * @return The federateType.
   */
  @java.lang.Override
  public java.lang.String getFederateType() {
    java.lang.Object ref = federateType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      federateType_ = s;
      return s;
    }
  }
  /**
   * <code>string federateType = 1;</code>
   * @return The bytes for federateType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFederateTypeBytes() {
    java.lang.Object ref = federateType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      federateType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEDERATIONNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object federationName_ = "";
  /**
   * <code>string federationName = 2;</code>
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
   * <code>string federationName = 2;</code>
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(federateType_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, federateType_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(federationName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, federationName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(federateType_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, federateType_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(federationName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, federationName_);
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.JoinFederationExecutionRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.JoinFederationExecutionRequest other = (hla.rti1516_2024.fedpro.JoinFederationExecutionRequest) obj;

    if (!getFederateType()
        .equals(other.getFederateType())) return false;
    if (!getFederationName()
        .equals(other.getFederationName())) return false;
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
    hash = (37 * hash) + FEDERATETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFederateType().hashCode();
    hash = (37 * hash) + FEDERATIONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFederationName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.JoinFederationExecutionRequest prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.JoinFederationExecutionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.JoinFederationExecutionRequest)
      hla.rti1516_2024.fedpro.JoinFederationExecutionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_JoinFederationExecutionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_JoinFederationExecutionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.JoinFederationExecutionRequest.class, hla.rti1516_2024.fedpro.JoinFederationExecutionRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.JoinFederationExecutionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      federateType_ = "";
      federationName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_JoinFederationExecutionRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.JoinFederationExecutionRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.JoinFederationExecutionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.JoinFederationExecutionRequest build() {
      hla.rti1516_2024.fedpro.JoinFederationExecutionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.JoinFederationExecutionRequest buildPartial() {
      hla.rti1516_2024.fedpro.JoinFederationExecutionRequest result = new hla.rti1516_2024.fedpro.JoinFederationExecutionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.JoinFederationExecutionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.federateType_ = federateType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.federationName_ = federationName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.JoinFederationExecutionRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.JoinFederationExecutionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.JoinFederationExecutionRequest other) {
      if (other == hla.rti1516_2024.fedpro.JoinFederationExecutionRequest.getDefaultInstance()) return this;
      if (!other.getFederateType().isEmpty()) {
        federateType_ = other.federateType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFederationName().isEmpty()) {
        federationName_ = other.federationName_;
        bitField0_ |= 0x00000002;
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
              federateType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              federationName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object federateType_ = "";
    /**
     * <code>string federateType = 1;</code>
     * @return The federateType.
     */
    public java.lang.String getFederateType() {
      java.lang.Object ref = federateType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        federateType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string federateType = 1;</code>
     * @return The bytes for federateType.
     */
    public com.google.protobuf.ByteString
        getFederateTypeBytes() {
      java.lang.Object ref = federateType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        federateType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string federateType = 1;</code>
     * @param value The federateType to set.
     * @return This builder for chaining.
     */
    public Builder setFederateType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      federateType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string federateType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFederateType() {
      federateType_ = getDefaultInstance().getFederateType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string federateType = 1;</code>
     * @param value The bytes for federateType to set.
     * @return This builder for chaining.
     */
    public Builder setFederateTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      federateType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object federationName_ = "";
    /**
     * <code>string federationName = 2;</code>
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
     * <code>string federationName = 2;</code>
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
     * <code>string federationName = 2;</code>
     * @param value The federationName to set.
     * @return This builder for chaining.
     */
    public Builder setFederationName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      federationName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string federationName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFederationName() {
      federationName_ = getDefaultInstance().getFederationName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string federationName = 2;</code>
     * @param value The bytes for federationName to set.
     * @return This builder for chaining.
     */
    public Builder setFederationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      federationName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.JoinFederationExecutionRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.JoinFederationExecutionRequest)
  private static final hla.rti1516_2024.fedpro.JoinFederationExecutionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.JoinFederationExecutionRequest();
  }

  public static hla.rti1516_2024.fedpro.JoinFederationExecutionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinFederationExecutionRequest>
      PARSER = new com.google.protobuf.AbstractParser<JoinFederationExecutionRequest>() {
    @java.lang.Override
    public JoinFederationExecutionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<JoinFederationExecutionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinFederationExecutionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.JoinFederationExecutionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

