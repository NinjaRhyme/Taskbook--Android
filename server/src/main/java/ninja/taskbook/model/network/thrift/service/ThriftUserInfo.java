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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-14")
public class ThriftUserInfo implements org.apache.thrift.TBase<ThriftUserInfo, ThriftUserInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftUserInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftUserInfo");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_NICKNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userNickname", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftUserInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftUserInfoTupleSchemeFactory());
  }

  public int userId; // required
  public String userName; // required
  public String userNickname; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    USER_NAME((short)2, "userName"),
    USER_NICKNAME((short)3, "userNickname");

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
        case 1: // USER_ID
          return USER_ID;
        case 2: // USER_NAME
          return USER_NAME;
        case 3: // USER_NICKNAME
          return USER_NICKNAME;
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
  private static final int __USERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_NICKNAME, new org.apache.thrift.meta_data.FieldMetaData("userNickname", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftUserInfo.class, metaDataMap);
  }

  public ThriftUserInfo() {
  }

  public ThriftUserInfo(
    int userId,
    String userName,
    String userNickname)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.userName = userName;
    this.userNickname = userNickname;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftUserInfo(ThriftUserInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userId = other.userId;
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    if (other.isSetUserNickname()) {
      this.userNickname = other.userNickname;
    }
  }

  public ThriftUserInfo deepCopy() {
    return new ThriftUserInfo(this);
  }

  @Override
  public void clear() {
    setUserIdIsSet(false);
    this.userId = 0;
    this.userName = null;
    this.userNickname = null;
  }

  public int getUserId() {
    return this.userId;
  }

  public ThriftUserInfo setUserId(int userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  public String getUserName() {
    return this.userName;
  }

  public ThriftUserInfo setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public String getUserNickname() {
    return this.userNickname;
  }

  public ThriftUserInfo setUserNickname(String userNickname) {
    this.userNickname = userNickname;
    return this;
  }

  public void unsetUserNickname() {
    this.userNickname = null;
  }

  /** Returns true if field userNickname is set (has been assigned a value) and false otherwise */
  public boolean isSetUserNickname() {
    return this.userNickname != null;
  }

  public void setUserNicknameIsSet(boolean value) {
    if (!value) {
      this.userNickname = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((Integer)value);
      }
      break;

    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;

    case USER_NICKNAME:
      if (value == null) {
        unsetUserNickname();
      } else {
        setUserNickname((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserId();

    case USER_NAME:
      return getUserName();

    case USER_NICKNAME:
      return getUserNickname();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case USER_NAME:
      return isSetUserName();
    case USER_NICKNAME:
      return isSetUserNickname();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftUserInfo)
      return this.equals((ThriftUserInfo)that);
    return false;
  }

  public boolean equals(ThriftUserInfo that) {
    if (that == null)
      return false;

    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_userNickname = true && this.isSetUserNickname();
    boolean that_present_userNickname = true && that.isSetUserNickname();
    if (this_present_userNickname || that_present_userNickname) {
      if (!(this_present_userNickname && that_present_userNickname))
        return false;
      if (!this.userNickname.equals(that.userNickname))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_userId = true;
    list.add(present_userId);
    if (present_userId)
      list.add(userId);

    boolean present_userName = true && (isSetUserName());
    list.add(present_userName);
    if (present_userName)
      list.add(userName);

    boolean present_userNickname = true && (isSetUserNickname());
    list.add(present_userNickname);
    if (present_userNickname)
      list.add(userNickname);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftUserInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserNickname()).compareTo(other.isSetUserNickname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserNickname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userNickname, other.userNickname);
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
    StringBuilder sb = new StringBuilder("ThriftUserInfo(");
    boolean first = true;

    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("userName:");
    if (this.userName == null) {
      sb.append("null");
    } else {
      sb.append(this.userName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userNickname:");
    if (this.userNickname == null) {
      sb.append("null");
    } else {
      sb.append(this.userNickname);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'userId' because it's a primitive and you chose the non-beans generator.
    if (userName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userName' was not present! Struct: " + toString());
    }
    if (userNickname == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userNickname' was not present! Struct: " + toString());
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

  private static class ThriftUserInfoStandardSchemeFactory implements SchemeFactory {
    public ThriftUserInfoStandardScheme getScheme() {
      return new ThriftUserInfoStandardScheme();
    }
  }

  private static class ThriftUserInfoStandardScheme extends StandardScheme<ThriftUserInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftUserInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.userId = iprot.readI32();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER_NICKNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userNickname = iprot.readString();
              struct.setUserNicknameIsSet(true);
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
      if (!struct.isSetUserId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftUserInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI32(struct.userId);
      oprot.writeFieldEnd();
      if (struct.userName != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.userName);
        oprot.writeFieldEnd();
      }
      if (struct.userNickname != null) {
        oprot.writeFieldBegin(USER_NICKNAME_FIELD_DESC);
        oprot.writeString(struct.userNickname);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftUserInfoTupleSchemeFactory implements SchemeFactory {
    public ThriftUserInfoTupleScheme getScheme() {
      return new ThriftUserInfoTupleScheme();
    }
  }

  private static class ThriftUserInfoTupleScheme extends TupleScheme<ThriftUserInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftUserInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.userId);
      oprot.writeString(struct.userName);
      oprot.writeString(struct.userNickname);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftUserInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.userId = iprot.readI32();
      struct.setUserIdIsSet(true);
      struct.userName = iprot.readString();
      struct.setUserNameIsSet(true);
      struct.userNickname = iprot.readString();
      struct.setUserNicknameIsSet(true);
    }
  }

}

