// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FederateAmbassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded}
 */
public final class SynchronizationPointRegistrationSucceeded extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded)
    SynchronizationPointRegistrationSucceededOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      SynchronizationPointRegistrationSucceeded.class.getName());
  }
  // Use SynchronizationPointRegistrationSucceeded.newBuilder() to construct.
  private SynchronizationPointRegistrationSucceeded(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SynchronizationPointRegistrationSucceeded() {
    synchronizationPointLabel_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_SynchronizationPointRegistrationSucceeded_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_SynchronizationPointRegistrationSucceeded_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded.class, hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded.Builder.class);
  }

  public static final int SYNCHRONIZATIONPOINTLABEL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object synchronizationPointLabel_ = "";
  /**
   * <code>string synchronizationPointLabel = 1;</code>
   * @return The synchronizationPointLabel.
   */
  @java.lang.Override
  public java.lang.String getSynchronizationPointLabel() {
    java.lang.Object ref = synchronizationPointLabel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      synchronizationPointLabel_ = s;
      return s;
    }
  }
  /**
   * <code>string synchronizationPointLabel = 1;</code>
   * @return The bytes for synchronizationPointLabel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSynchronizationPointLabelBytes() {
    java.lang.Object ref = synchronizationPointLabel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      synchronizationPointLabel_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(synchronizationPointLabel_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, synchronizationPointLabel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(synchronizationPointLabel_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, synchronizationPointLabel_);
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded other = (hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded) obj;

    if (!getSynchronizationPointLabel()
        .equals(other.getSynchronizationPointLabel())) return false;
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
    hash = (37 * hash) + SYNCHRONIZATIONPOINTLABEL_FIELD_NUMBER;
    hash = (53 * hash) + getSynchronizationPointLabel().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded)
      hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceededOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_SynchronizationPointRegistrationSucceeded_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_SynchronizationPointRegistrationSucceeded_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded.class, hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded.newBuilder()
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
      synchronizationPointLabel_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_SynchronizationPointRegistrationSucceeded_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded build() {
      hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded buildPartial() {
      hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded result = new hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.synchronizationPointLabel_ = synchronizationPointLabel_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded) {
        return mergeFrom((hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded other) {
      if (other == hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded.getDefaultInstance()) return this;
      if (!other.getSynchronizationPointLabel().isEmpty()) {
        synchronizationPointLabel_ = other.synchronizationPointLabel_;
        bitField0_ |= 0x00000001;
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
              synchronizationPointLabel_ = input.readStringRequireUtf8();
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

    private java.lang.Object synchronizationPointLabel_ = "";
    /**
     * <code>string synchronizationPointLabel = 1;</code>
     * @return The synchronizationPointLabel.
     */
    public java.lang.String getSynchronizationPointLabel() {
      java.lang.Object ref = synchronizationPointLabel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        synchronizationPointLabel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string synchronizationPointLabel = 1;</code>
     * @return The bytes for synchronizationPointLabel.
     */
    public com.google.protobuf.ByteString
        getSynchronizationPointLabelBytes() {
      java.lang.Object ref = synchronizationPointLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        synchronizationPointLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string synchronizationPointLabel = 1;</code>
     * @param value The synchronizationPointLabel to set.
     * @return This builder for chaining.
     */
    public Builder setSynchronizationPointLabel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      synchronizationPointLabel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string synchronizationPointLabel = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSynchronizationPointLabel() {
      synchronizationPointLabel_ = getDefaultInstance().getSynchronizationPointLabel();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string synchronizationPointLabel = 1;</code>
     * @param value The bytes for synchronizationPointLabel to set.
     * @return This builder for chaining.
     */
    public Builder setSynchronizationPointLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      synchronizationPointLabel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded)
  private static final hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded();
  }

  public static hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SynchronizationPointRegistrationSucceeded>
      PARSER = new com.google.protobuf.AbstractParser<SynchronizationPointRegistrationSucceeded>() {
    @java.lang.Override
    public SynchronizationPointRegistrationSucceeded parsePartialFrom(
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

  public static com.google.protobuf.Parser<SynchronizationPointRegistrationSucceeded> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SynchronizationPointRegistrationSucceeded> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.SynchronizationPointRegistrationSucceeded getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

