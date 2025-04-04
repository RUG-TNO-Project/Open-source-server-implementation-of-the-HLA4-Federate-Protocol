// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse}
 */
public final class ConnectWithConfigurationAndCredentialsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse)
    ConnectWithConfigurationAndCredentialsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      ConnectWithConfigurationAndCredentialsResponse.class.getName());
  }
  // Use ConnectWithConfigurationAndCredentialsResponse.newBuilder() to construct.
  private ConnectWithConfigurationAndCredentialsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ConnectWithConfigurationAndCredentialsResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ConnectWithConfigurationAndCredentialsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ConnectWithConfigurationAndCredentialsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse.class, hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CONFIGURATIONRESULT_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.ConfigurationResult configurationResult_;
  /**
   * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
   * @return Whether the configurationResult field is set.
   */
  @java.lang.Override
  public boolean hasConfigurationResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
   * @return The configurationResult.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.ConfigurationResult getConfigurationResult() {
    return configurationResult_ == null ? hla.rti1516_2024.fedpro.ConfigurationResult.getDefaultInstance() : configurationResult_;
  }
  /**
   * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.ConfigurationResultOrBuilder getConfigurationResultOrBuilder() {
    return configurationResult_ == null ? hla.rti1516_2024.fedpro.ConfigurationResult.getDefaultInstance() : configurationResult_;
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
      output.writeMessage(1, getConfigurationResult());
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
        .computeMessageSize(1, getConfigurationResult());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse other = (hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse) obj;

    if (hasConfigurationResult() != other.hasConfigurationResult()) return false;
    if (hasConfigurationResult()) {
      if (!getConfigurationResult()
          .equals(other.getConfigurationResult())) return false;
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
    if (hasConfigurationResult()) {
      hash = (37 * hash) + CONFIGURATIONRESULT_FIELD_NUMBER;
      hash = (53 * hash) + getConfigurationResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse)
      hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ConnectWithConfigurationAndCredentialsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ConnectWithConfigurationAndCredentialsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse.class, hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse.newBuilder()
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
        internalGetConfigurationResultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      configurationResult_ = null;
      if (configurationResultBuilder_ != null) {
        configurationResultBuilder_.dispose();
        configurationResultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ConnectWithConfigurationAndCredentialsResponse_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse build() {
      hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse buildPartial() {
      hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse result = new hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.configurationResult_ = configurationResultBuilder_ == null
            ? configurationResult_
            : configurationResultBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse) {
        return mergeFrom((hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse other) {
      if (other == hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse.getDefaultInstance()) return this;
      if (other.hasConfigurationResult()) {
        mergeConfigurationResult(other.getConfigurationResult());
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
                  internalGetConfigurationResultFieldBuilder().getBuilder(),
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

    private hla.rti1516_2024.fedpro.ConfigurationResult configurationResult_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.ConfigurationResult, hla.rti1516_2024.fedpro.ConfigurationResult.Builder, hla.rti1516_2024.fedpro.ConfigurationResultOrBuilder> configurationResultBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
     * @return Whether the configurationResult field is set.
     */
    public boolean hasConfigurationResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
     * @return The configurationResult.
     */
    public hla.rti1516_2024.fedpro.ConfigurationResult getConfigurationResult() {
      if (configurationResultBuilder_ == null) {
        return configurationResult_ == null ? hla.rti1516_2024.fedpro.ConfigurationResult.getDefaultInstance() : configurationResult_;
      } else {
        return configurationResultBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public Builder setConfigurationResult(hla.rti1516_2024.fedpro.ConfigurationResult value) {
      if (configurationResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configurationResult_ = value;
      } else {
        configurationResultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public Builder setConfigurationResult(
        hla.rti1516_2024.fedpro.ConfigurationResult.Builder builderForValue) {
      if (configurationResultBuilder_ == null) {
        configurationResult_ = builderForValue.build();
      } else {
        configurationResultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public Builder mergeConfigurationResult(hla.rti1516_2024.fedpro.ConfigurationResult value) {
      if (configurationResultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          configurationResult_ != null &&
          configurationResult_ != hla.rti1516_2024.fedpro.ConfigurationResult.getDefaultInstance()) {
          getConfigurationResultBuilder().mergeFrom(value);
        } else {
          configurationResult_ = value;
        }
      } else {
        configurationResultBuilder_.mergeFrom(value);
      }
      if (configurationResult_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public Builder clearConfigurationResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      configurationResult_ = null;
      if (configurationResultBuilder_ != null) {
        configurationResultBuilder_.dispose();
        configurationResultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public hla.rti1516_2024.fedpro.ConfigurationResult.Builder getConfigurationResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetConfigurationResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    public hla.rti1516_2024.fedpro.ConfigurationResultOrBuilder getConfigurationResultOrBuilder() {
      if (configurationResultBuilder_ != null) {
        return configurationResultBuilder_.getMessageOrBuilder();
      } else {
        return configurationResult_ == null ?
            hla.rti1516_2024.fedpro.ConfigurationResult.getDefaultInstance() : configurationResult_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.ConfigurationResult configurationResult = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.ConfigurationResult, hla.rti1516_2024.fedpro.ConfigurationResult.Builder, hla.rti1516_2024.fedpro.ConfigurationResultOrBuilder> 
        internalGetConfigurationResultFieldBuilder() {
      if (configurationResultBuilder_ == null) {
        configurationResultBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.ConfigurationResult, hla.rti1516_2024.fedpro.ConfigurationResult.Builder, hla.rti1516_2024.fedpro.ConfigurationResultOrBuilder>(
                getConfigurationResult(),
                getParentForChildren(),
                isClean());
        configurationResult_ = null;
      }
      return configurationResultBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse)
  private static final hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse();
  }

  public static hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectWithConfigurationAndCredentialsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ConnectWithConfigurationAndCredentialsResponse>() {
    @java.lang.Override
    public ConnectWithConfigurationAndCredentialsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConnectWithConfigurationAndCredentialsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectWithConfigurationAndCredentialsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.ConnectWithConfigurationAndCredentialsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

