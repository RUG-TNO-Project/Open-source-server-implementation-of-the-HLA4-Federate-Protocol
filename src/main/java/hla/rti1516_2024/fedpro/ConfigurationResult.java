// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: datatypes.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.ConfigurationResult}
 */
public final class ConfigurationResult extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.ConfigurationResult)
    ConfigurationResultOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      ConfigurationResult.class.getName());
  }
  // Use ConfigurationResult.newBuilder() to construct.
  private ConfigurationResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ConfigurationResult() {
    additionalSettingsResultCode_ = 0;
    message_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_ConfigurationResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_ConfigurationResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.ConfigurationResult.class, hla.rti1516_2024.fedpro.ConfigurationResult.Builder.class);
  }

  public static final int CONFIGURATIONUSED_FIELD_NUMBER = 1;
  private boolean configurationUsed_ = false;
  /**
   * <code>bool configurationUsed = 1;</code>
   * @return The configurationUsed.
   */
  @java.lang.Override
  public boolean getConfigurationUsed() {
    return configurationUsed_;
  }

  public static final int ADDRESSUSED_FIELD_NUMBER = 2;
  private boolean addressUsed_ = false;
  /**
   * <code>bool addressUsed = 2;</code>
   * @return The addressUsed.
   */
  @java.lang.Override
  public boolean getAddressUsed() {
    return addressUsed_;
  }

  public static final int ADDITIONALSETTINGSRESULTCODE_FIELD_NUMBER = 3;
  private int additionalSettingsResultCode_ = 0;
  /**
   * <code>.rti1516_2024.fedpro.AdditionalSettingsResultCode additionalSettingsResultCode = 3;</code>
   * @return The enum numeric value on the wire for additionalSettingsResultCode.
   */
  @java.lang.Override public int getAdditionalSettingsResultCodeValue() {
    return additionalSettingsResultCode_;
  }
  /**
   * <code>.rti1516_2024.fedpro.AdditionalSettingsResultCode additionalSettingsResultCode = 3;</code>
   * @return The additionalSettingsResultCode.
   */
  @java.lang.Override public hla.rti1516_2024.fedpro.AdditionalSettingsResultCode getAdditionalSettingsResultCode() {
    hla.rti1516_2024.fedpro.AdditionalSettingsResultCode result = hla.rti1516_2024.fedpro.AdditionalSettingsResultCode.forNumber(additionalSettingsResultCode_);
    return result == null ? hla.rti1516_2024.fedpro.AdditionalSettingsResultCode.UNRECOGNIZED : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 4;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 4;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (configurationUsed_ != false) {
      output.writeBool(1, configurationUsed_);
    }
    if (addressUsed_ != false) {
      output.writeBool(2, addressUsed_);
    }
    if (additionalSettingsResultCode_ != hla.rti1516_2024.fedpro.AdditionalSettingsResultCode.SETTINGS_IGNORED.getNumber()) {
      output.writeEnum(3, additionalSettingsResultCode_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (configurationUsed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, configurationUsed_);
    }
    if (addressUsed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, addressUsed_);
    }
    if (additionalSettingsResultCode_ != hla.rti1516_2024.fedpro.AdditionalSettingsResultCode.SETTINGS_IGNORED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, additionalSettingsResultCode_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, message_);
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.ConfigurationResult)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.ConfigurationResult other = (hla.rti1516_2024.fedpro.ConfigurationResult) obj;

    if (getConfigurationUsed()
        != other.getConfigurationUsed()) return false;
    if (getAddressUsed()
        != other.getAddressUsed()) return false;
    if (additionalSettingsResultCode_ != other.additionalSettingsResultCode_) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + CONFIGURATIONUSED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getConfigurationUsed());
    hash = (37 * hash) + ADDRESSUSED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAddressUsed());
    hash = (37 * hash) + ADDITIONALSETTINGSRESULTCODE_FIELD_NUMBER;
    hash = (53 * hash) + additionalSettingsResultCode_;
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.ConfigurationResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ConfigurationResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConfigurationResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ConfigurationResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConfigurationResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ConfigurationResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConfigurationResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.ConfigurationResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.ConfigurationResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.ConfigurationResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConfigurationResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.ConfigurationResult parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.ConfigurationResult prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.ConfigurationResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.ConfigurationResult)
      hla.rti1516_2024.fedpro.ConfigurationResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_ConfigurationResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_ConfigurationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.ConfigurationResult.class, hla.rti1516_2024.fedpro.ConfigurationResult.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.ConfigurationResult.newBuilder()
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
      configurationUsed_ = false;
      addressUsed_ = false;
      additionalSettingsResultCode_ = 0;
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_ConfigurationResult_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ConfigurationResult getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.ConfigurationResult.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ConfigurationResult build() {
      hla.rti1516_2024.fedpro.ConfigurationResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ConfigurationResult buildPartial() {
      hla.rti1516_2024.fedpro.ConfigurationResult result = new hla.rti1516_2024.fedpro.ConfigurationResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.ConfigurationResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.configurationUsed_ = configurationUsed_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.addressUsed_ = addressUsed_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.additionalSettingsResultCode_ = additionalSettingsResultCode_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.message_ = message_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.ConfigurationResult) {
        return mergeFrom((hla.rti1516_2024.fedpro.ConfigurationResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.ConfigurationResult other) {
      if (other == hla.rti1516_2024.fedpro.ConfigurationResult.getDefaultInstance()) return this;
      if (other.getConfigurationUsed() != false) {
        setConfigurationUsed(other.getConfigurationUsed());
      }
      if (other.getAddressUsed() != false) {
        setAddressUsed(other.getAddressUsed());
      }
      if (other.additionalSettingsResultCode_ != 0) {
        setAdditionalSettingsResultCodeValue(other.getAdditionalSettingsResultCodeValue());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000008;
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
            case 8: {
              configurationUsed_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              addressUsed_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              additionalSettingsResultCode_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private boolean configurationUsed_ ;
    /**
     * <code>bool configurationUsed = 1;</code>
     * @return The configurationUsed.
     */
    @java.lang.Override
    public boolean getConfigurationUsed() {
      return configurationUsed_;
    }
    /**
     * <code>bool configurationUsed = 1;</code>
     * @param value The configurationUsed to set.
     * @return This builder for chaining.
     */
    public Builder setConfigurationUsed(boolean value) {

      configurationUsed_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool configurationUsed = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfigurationUsed() {
      bitField0_ = (bitField0_ & ~0x00000001);
      configurationUsed_ = false;
      onChanged();
      return this;
    }

    private boolean addressUsed_ ;
    /**
     * <code>bool addressUsed = 2;</code>
     * @return The addressUsed.
     */
    @java.lang.Override
    public boolean getAddressUsed() {
      return addressUsed_;
    }
    /**
     * <code>bool addressUsed = 2;</code>
     * @param value The addressUsed to set.
     * @return This builder for chaining.
     */
    public Builder setAddressUsed(boolean value) {

      addressUsed_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool addressUsed = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddressUsed() {
      bitField0_ = (bitField0_ & ~0x00000002);
      addressUsed_ = false;
      onChanged();
      return this;
    }

    private int additionalSettingsResultCode_ = 0;
    /**
     * <code>.rti1516_2024.fedpro.AdditionalSettingsResultCode additionalSettingsResultCode = 3;</code>
     * @return The enum numeric value on the wire for additionalSettingsResultCode.
     */
    @java.lang.Override public int getAdditionalSettingsResultCodeValue() {
      return additionalSettingsResultCode_;
    }
    /**
     * <code>.rti1516_2024.fedpro.AdditionalSettingsResultCode additionalSettingsResultCode = 3;</code>
     * @param value The enum numeric value on the wire for additionalSettingsResultCode to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionalSettingsResultCodeValue(int value) {
      additionalSettingsResultCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.AdditionalSettingsResultCode additionalSettingsResultCode = 3;</code>
     * @return The additionalSettingsResultCode.
     */
    @java.lang.Override
    public hla.rti1516_2024.fedpro.AdditionalSettingsResultCode getAdditionalSettingsResultCode() {
      hla.rti1516_2024.fedpro.AdditionalSettingsResultCode result = hla.rti1516_2024.fedpro.AdditionalSettingsResultCode.forNumber(additionalSettingsResultCode_);
      return result == null ? hla.rti1516_2024.fedpro.AdditionalSettingsResultCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.rti1516_2024.fedpro.AdditionalSettingsResultCode additionalSettingsResultCode = 3;</code>
     * @param value The additionalSettingsResultCode to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionalSettingsResultCode(hla.rti1516_2024.fedpro.AdditionalSettingsResultCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      additionalSettingsResultCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.AdditionalSettingsResultCode additionalSettingsResultCode = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdditionalSettingsResultCode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      additionalSettingsResultCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 4;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 4;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 4;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 4;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.ConfigurationResult)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.ConfigurationResult)
  private static final hla.rti1516_2024.fedpro.ConfigurationResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.ConfigurationResult();
  }

  public static hla.rti1516_2024.fedpro.ConfigurationResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfigurationResult>
      PARSER = new com.google.protobuf.AbstractParser<ConfigurationResult>() {
    @java.lang.Override
    public ConfigurationResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConfigurationResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfigurationResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.ConfigurationResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

