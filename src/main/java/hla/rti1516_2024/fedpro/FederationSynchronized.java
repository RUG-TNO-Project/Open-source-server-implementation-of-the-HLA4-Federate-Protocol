// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FederateAmbassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.FederationSynchronized}
 */
public final class FederationSynchronized extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.FederationSynchronized)
    FederationSynchronizedOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      FederationSynchronized.class.getName());
  }
  // Use FederationSynchronized.newBuilder() to construct.
  private FederationSynchronized(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FederationSynchronized() {
    synchronizationPointLabel_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_FederationSynchronized_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_FederationSynchronized_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.FederationSynchronized.class, hla.rti1516_2024.fedpro.FederationSynchronized.Builder.class);
  }

  private int bitField0_;
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

  public static final int FAILEDTOSYNCSET_FIELD_NUMBER = 2;
  private hla.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet_;
  /**
   * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   * @return Whether the failedToSyncSet field is set.
   */
  @java.lang.Override
  public boolean hasFailedToSyncSet() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   * @return The failedToSyncSet.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.FederateHandleSet getFailedToSyncSet() {
    return failedToSyncSet_ == null ? hla.rti1516_2024.fedpro.FederateHandleSet.getDefaultInstance() : failedToSyncSet_;
  }
  /**
   * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.FederateHandleSetOrBuilder getFailedToSyncSetOrBuilder() {
    return failedToSyncSet_ == null ? hla.rti1516_2024.fedpro.FederateHandleSet.getDefaultInstance() : failedToSyncSet_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getFailedToSyncSet());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFailedToSyncSet());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.FederationSynchronized)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.FederationSynchronized other = (hla.rti1516_2024.fedpro.FederationSynchronized) obj;

    if (!getSynchronizationPointLabel()
        .equals(other.getSynchronizationPointLabel())) return false;
    if (hasFailedToSyncSet() != other.hasFailedToSyncSet()) return false;
    if (hasFailedToSyncSet()) {
      if (!getFailedToSyncSet()
          .equals(other.getFailedToSyncSet())) return false;
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
    hash = (37 * hash) + SYNCHRONIZATIONPOINTLABEL_FIELD_NUMBER;
    hash = (53 * hash) + getSynchronizationPointLabel().hashCode();
    if (hasFailedToSyncSet()) {
      hash = (37 * hash) + FAILEDTOSYNCSET_FIELD_NUMBER;
      hash = (53 * hash) + getFailedToSyncSet().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.FederationSynchronized parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.FederationSynchronized parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.FederationSynchronized parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.FederationSynchronized parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.FederationSynchronized parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.FederationSynchronized parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.FederationSynchronized parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.FederationSynchronized parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.FederationSynchronized parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.FederationSynchronized parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.FederationSynchronized parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.FederationSynchronized parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.FederationSynchronized prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.FederationSynchronized}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.FederationSynchronized)
      hla.rti1516_2024.fedpro.FederationSynchronizedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_FederationSynchronized_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_FederationSynchronized_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.FederationSynchronized.class, hla.rti1516_2024.fedpro.FederationSynchronized.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.FederationSynchronized.newBuilder()
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
        internalGetFailedToSyncSetFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      synchronizationPointLabel_ = "";
      failedToSyncSet_ = null;
      if (failedToSyncSetBuilder_ != null) {
        failedToSyncSetBuilder_.dispose();
        failedToSyncSetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_FederationSynchronized_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.FederationSynchronized getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.FederationSynchronized.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.FederationSynchronized build() {
      hla.rti1516_2024.fedpro.FederationSynchronized result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.FederationSynchronized buildPartial() {
      hla.rti1516_2024.fedpro.FederationSynchronized result = new hla.rti1516_2024.fedpro.FederationSynchronized(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.FederationSynchronized result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.synchronizationPointLabel_ = synchronizationPointLabel_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.failedToSyncSet_ = failedToSyncSetBuilder_ == null
            ? failedToSyncSet_
            : failedToSyncSetBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.FederationSynchronized) {
        return mergeFrom((hla.rti1516_2024.fedpro.FederationSynchronized)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.FederationSynchronized other) {
      if (other == hla.rti1516_2024.fedpro.FederationSynchronized.getDefaultInstance()) return this;
      if (!other.getSynchronizationPointLabel().isEmpty()) {
        synchronizationPointLabel_ = other.synchronizationPointLabel_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasFailedToSyncSet()) {
        mergeFailedToSyncSet(other.getFailedToSyncSet());
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
            case 18: {
              input.readMessage(
                  internalGetFailedToSyncSetFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private hla.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.FederateHandleSet, hla.rti1516_2024.fedpro.FederateHandleSet.Builder, hla.rti1516_2024.fedpro.FederateHandleSetOrBuilder> failedToSyncSetBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     * @return Whether the failedToSyncSet field is set.
     */
    public boolean hasFailedToSyncSet() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     * @return The failedToSyncSet.
     */
    public hla.rti1516_2024.fedpro.FederateHandleSet getFailedToSyncSet() {
      if (failedToSyncSetBuilder_ == null) {
        return failedToSyncSet_ == null ? hla.rti1516_2024.fedpro.FederateHandleSet.getDefaultInstance() : failedToSyncSet_;
      } else {
        return failedToSyncSetBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public Builder setFailedToSyncSet(hla.rti1516_2024.fedpro.FederateHandleSet value) {
      if (failedToSyncSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        failedToSyncSet_ = value;
      } else {
        failedToSyncSetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public Builder setFailedToSyncSet(
        hla.rti1516_2024.fedpro.FederateHandleSet.Builder builderForValue) {
      if (failedToSyncSetBuilder_ == null) {
        failedToSyncSet_ = builderForValue.build();
      } else {
        failedToSyncSetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public Builder mergeFailedToSyncSet(hla.rti1516_2024.fedpro.FederateHandleSet value) {
      if (failedToSyncSetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          failedToSyncSet_ != null &&
          failedToSyncSet_ != hla.rti1516_2024.fedpro.FederateHandleSet.getDefaultInstance()) {
          getFailedToSyncSetBuilder().mergeFrom(value);
        } else {
          failedToSyncSet_ = value;
        }
      } else {
        failedToSyncSetBuilder_.mergeFrom(value);
      }
      if (failedToSyncSet_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public Builder clearFailedToSyncSet() {
      bitField0_ = (bitField0_ & ~0x00000002);
      failedToSyncSet_ = null;
      if (failedToSyncSetBuilder_ != null) {
        failedToSyncSetBuilder_.dispose();
        failedToSyncSetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandleSet.Builder getFailedToSyncSetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return internalGetFailedToSyncSetFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandleSetOrBuilder getFailedToSyncSetOrBuilder() {
      if (failedToSyncSetBuilder_ != null) {
        return failedToSyncSetBuilder_.getMessageOrBuilder();
      } else {
        return failedToSyncSet_ == null ?
            hla.rti1516_2024.fedpro.FederateHandleSet.getDefaultInstance() : failedToSyncSet_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.FederateHandleSet, hla.rti1516_2024.fedpro.FederateHandleSet.Builder, hla.rti1516_2024.fedpro.FederateHandleSetOrBuilder> 
        internalGetFailedToSyncSetFieldBuilder() {
      if (failedToSyncSetBuilder_ == null) {
        failedToSyncSetBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.FederateHandleSet, hla.rti1516_2024.fedpro.FederateHandleSet.Builder, hla.rti1516_2024.fedpro.FederateHandleSetOrBuilder>(
                getFailedToSyncSet(),
                getParentForChildren(),
                isClean());
        failedToSyncSet_ = null;
      }
      return failedToSyncSetBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.FederationSynchronized)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.FederationSynchronized)
  private static final hla.rti1516_2024.fedpro.FederationSynchronized DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.FederationSynchronized();
  }

  public static hla.rti1516_2024.fedpro.FederationSynchronized getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FederationSynchronized>
      PARSER = new com.google.protobuf.AbstractParser<FederationSynchronized>() {
    @java.lang.Override
    public FederationSynchronized parsePartialFrom(
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

  public static com.google.protobuf.Parser<FederationSynchronized> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FederationSynchronized> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.FederationSynchronized getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

