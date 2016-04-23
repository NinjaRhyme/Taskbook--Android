/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ninja.taskbook.model.network.thrift.service;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-04-18")
public class ThriftGroupInfo implements org.apache.thrift.TBase<ThriftGroupInfo, ThriftGroupInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftGroupInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftGroupInfo");

  private static final org.apache.thrift.protocol.TField GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("groupId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField GROUP_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("groupName", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftGroupInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftGroupInfoTupleSchemeFactory());
  }

  public int groupId; // required
  public String groupName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GROUP_ID((short)1, "groupId"),
    GROUP_NAME((short)2, "groupName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GROUP_ID
          return GROUP_ID;
        case 2: // GROUP_NAME
          return GROUP_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __GROUPID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("groupId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.GROUP_NAME, new org.apache.thrift.meta_data.FieldMetaData("groupName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftGroupInfo.class, metaDataMap);
  }

  public ThriftGroupInfo() {
  }

  public ThriftGroupInfo(
    int groupId,
    String groupName)
  {
    this();
    this.groupId = groupId;
    setGroupIdIsSet(true);
    this.groupName = groupName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftGroupInfo(ThriftGroupInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.groupId = other.groupId;
    if (other.isSetGroupName()) {
      this.groupName = other.groupName;
    }
  }

  public ThriftGroupInfo deepCopy() {
    return new ThriftGroupInfo(this);
  }

  @Override
  public void clear() {
    setGroupIdIsSet(false);
    this.groupId = 0;
    this.groupName = null;
  }

  public int getGroupId() {
    return this.groupId;
  }

  public ThriftGroupInfo setGroupId(int groupId) {
    this.groupId = groupId;
    setGroupIdIsSet(true);
    return this;
  }

  public void unsetGroupId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GROUPID_ISSET_ID);
  }

  /** Returns true if field groupId is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupId() {
    return EncodingUtils.testBit(__isset_bitfield, __GROUPID_ISSET_ID);
  }

  public void setGroupIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GROUPID_ISSET_ID, value);
  }

  public String getGroupName() {
    return this.groupName;
  }

  public ThriftGroupInfo setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public void unsetGroupName() {
    this.groupName = null;
  }

  /** Returns true if field groupName is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupName() {
    return this.groupName != null;
  }

  public void setGroupNameIsSet(boolean value) {
    if (!value) {
      this.groupName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GROUP_ID:
      if (value == null) {
        unsetGroupId();
      } else {
        setGroupId((Integer)value);
      }
      break;

    case GROUP_NAME:
      if (value == null) {
        unsetGroupName();
      } else {
        setGroupName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GROUP_ID:
      return getGroupId();

    case GROUP_NAME:
      return getGroupName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GROUP_ID:
      return isSetGroupId();
    case GROUP_NAME:
      return isSetGroupName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftGroupInfo)
      return this.equals((ThriftGroupInfo)that);
    return false;
  }

  public boolean equals(ThriftGroupInfo that) {
    if (that == null)
      return false;

    boolean this_present_groupId = true;
    boolean that_present_groupId = true;
    if (this_present_groupId || that_present_groupId) {
      if (!(this_present_groupId && that_present_groupId))
        return false;
      if (this.groupId != that.groupId)
        return false;
    }

    boolean this_present_groupName = true && this.isSetGroupName();
    boolean that_present_groupName = true && that.isSetGroupName();
    if (this_present_groupName || that_present_groupName) {
      if (!(this_present_groupName && that_present_groupName))
        return false;
      if (!this.groupName.equals(that.groupName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_groupId = true;
    list.add(present_groupId);
    if (present_groupId)
      list.add(groupId);

    boolean present_groupName = true && (isSetGroupName());
    list.add(present_groupName);
    if (present_groupName)
      list.add(groupName);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftGroupInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGroupId()).compareTo(other.isSetGroupId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupId, other.groupId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroupName()).compareTo(other.isSetGroupName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupName, other.groupName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftGroupInfo(");
    boolean first = true;

    sb.append("groupId:");
    sb.append(this.groupId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("groupName:");
    if (this.groupName == null) {
      sb.append("null");
    } else {
      sb.append(this.groupName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'groupId' because it's a primitive and you chose the non-beans generator.
    if (groupName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'groupName' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftGroupInfoStandardSchemeFactory implements SchemeFactory {
    public ThriftGroupInfoStandardScheme getScheme() {
      return new ThriftGroupInfoStandardScheme();
    }
  }

  private static class ThriftGroupInfoStandardScheme extends StandardScheme<ThriftGroupInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftGroupInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GROUP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.groupId = iprot.readI32();
              struct.setGroupIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GROUP_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.groupName = iprot.readString();
              struct.setGroupNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetGroupId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'groupId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftGroupInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(GROUP_ID_FIELD_DESC);
      oprot.writeI32(struct.groupId);
      oprot.writeFieldEnd();
      if (struct.groupName != null) {
        oprot.writeFieldBegin(GROUP_NAME_FIELD_DESC);
        oprot.writeString(struct.groupName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftGroupInfoTupleSchemeFactory implements SchemeFactory {
    public ThriftGroupInfoTupleScheme getScheme() {
      return new ThriftGroupInfoTupleScheme();
    }
  }

  private static class ThriftGroupInfoTupleScheme extends TupleScheme<ThriftGroupInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftGroupInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.groupId);
      oprot.writeString(struct.groupName);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftGroupInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.groupId = iprot.readI32();
      struct.setGroupIdIsSet(true);
      struct.groupName = iprot.readString();
      struct.setGroupNameIsSet(true);
    }
  }

}
