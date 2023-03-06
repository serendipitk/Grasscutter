// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ELEEFNHCAOL.proto

package emu.grasscutter.net.proto;

public final class ELEEFNHCAOLOuterClass {
  private ELEEFNHCAOLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ELEEFNHCAOLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ELEEFNHCAOL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_finished = 13;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 stage_id = 10;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Name: ELEEFNHCAOL
   * </pre>
   *
   * Protobuf type {@code ELEEFNHCAOL}
   */
  public static final class ELEEFNHCAOL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ELEEFNHCAOL)
      ELEEFNHCAOLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ELEEFNHCAOL.newBuilder() to construct.
    private ELEEFNHCAOL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ELEEFNHCAOL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ELEEFNHCAOL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.internal_static_ELEEFNHCAOL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.internal_static_ELEEFNHCAOL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.class, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 6;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 13;
    private boolean isFinished_ = false;
    /**
     * <code>bool is_finished = 13;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 10;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 10;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 8;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (levelId_ != 0) {
        output.writeUInt32(6, levelId_);
      }
      if (isOpen_ != false) {
        output.writeBool(8, isOpen_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(10, stageId_);
      }
      if (isFinished_ != false) {
        output.writeBool(13, isFinished_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, levelId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isOpen_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, stageId_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isFinished_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL other = (emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: ELEEFNHCAOL
     * </pre>
     *
     * Protobuf type {@code ELEEFNHCAOL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ELEEFNHCAOL)
        emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.internal_static_ELEEFNHCAOL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.internal_static_ELEEFNHCAOL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.class, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        levelId_ = 0;
        isFinished_ = false;
        stageId_ = 0;
        isOpen_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.internal_static_ELEEFNHCAOL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL build() {
        emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL buildPartial() {
        emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL result = new emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isFinished_ = isFinished_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.stageId_ = stageId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isOpen_ = isOpen_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL) {
          return mergeFrom((emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL other) {
        if (other == emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
              case 48: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 64: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 64
              case 80: {
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
              case 104: {
                isFinished_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 6;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 13;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 13;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 10;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 10;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 8;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isOpen_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ELEEFNHCAOL)
    }

    // @@protoc_insertion_point(class_scope:ELEEFNHCAOL)
    private static final emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL();
    }

    public static emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ELEEFNHCAOL>
        PARSER = new com.google.protobuf.AbstractParser<ELEEFNHCAOL>() {
      @java.lang.Override
      public ELEEFNHCAOL parsePartialFrom(
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

    public static com.google.protobuf.Parser<ELEEFNHCAOL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ELEEFNHCAOL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ELEEFNHCAOL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ELEEFNHCAOL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ELEEFNHCAOL.proto\"W\n\013ELEEFNHCAOL\022\020\n\010le" +
      "vel_id\030\006 \001(\r\022\023\n\013is_finished\030\r \001(\010\022\020\n\010sta" +
      "ge_id\030\n \001(\r\022\017\n\007is_open\030\010 \001(\010B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ELEEFNHCAOL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ELEEFNHCAOL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ELEEFNHCAOL_descriptor,
        new java.lang.String[] { "LevelId", "IsFinished", "StageId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}