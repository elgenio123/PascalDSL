/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.array_type;
import org.xtext.example.pascal.pascal.dynamic_array_type;
import org.xtext.example.pascal.pascal.file_type;
import org.xtext.example.pascal.pascal.record_type;
import org.xtext.example.pascal.pascal.set_type;
import org.xtext.example.pascal.pascal.unpacked_structured_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unpacked structured type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_structured_typeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_structured_typeImpl#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_structured_typeImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_structured_typeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_structured_typeImpl#getFile <em>File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class unpacked_structured_typeImpl extends MinimalEObjectImpl.Container implements unpacked_structured_type
{
  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected array_type array;

  /**
   * The cached value of the '{@link #getDynamic() <em>Dynamic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDynamic()
   * @generated
   * @ordered
   */
  protected dynamic_array_type dynamic;

  /**
   * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecord()
   * @generated
   * @ordered
   */
  protected record_type record;

  /**
   * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected set_type set;

  /**
   * The cached value of the '{@link #getFile() <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile()
   * @generated
   * @ordered
   */
  protected file_type file;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unpacked_structured_typeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.UNPACKED_STRUCTURED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public array_type getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArray(array_type newArray, NotificationChain msgs)
  {
    array_type oldArray = array;
    array = newArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY, oldArray, newArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArray(array_type newArray)
  {
    if (newArray != array)
    {
      NotificationChain msgs = null;
      if (array != null)
        msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY, null, msgs);
      if (newArray != null)
        msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY, null, msgs);
      msgs = basicSetArray(newArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY, newArray, newArray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public dynamic_array_type getDynamic()
  {
    return dynamic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDynamic(dynamic_array_type newDynamic, NotificationChain msgs)
  {
    dynamic_array_type oldDynamic = dynamic;
    dynamic = newDynamic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__DYNAMIC, oldDynamic, newDynamic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDynamic(dynamic_array_type newDynamic)
  {
    if (newDynamic != dynamic)
    {
      NotificationChain msgs = null;
      if (dynamic != null)
        msgs = ((InternalEObject)dynamic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__DYNAMIC, null, msgs);
      if (newDynamic != null)
        msgs = ((InternalEObject)newDynamic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__DYNAMIC, null, msgs);
      msgs = basicSetDynamic(newDynamic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__DYNAMIC, newDynamic, newDynamic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public record_type getRecord()
  {
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecord(record_type newRecord, NotificationChain msgs)
  {
    record_type oldRecord = record;
    record = newRecord;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD, oldRecord, newRecord);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRecord(record_type newRecord)
  {
    if (newRecord != record)
    {
      NotificationChain msgs = null;
      if (record != null)
        msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD, null, msgs);
      if (newRecord != null)
        msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD, null, msgs);
      msgs = basicSetRecord(newRecord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD, newRecord, newRecord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public set_type getSet()
  {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet(set_type newSet, NotificationChain msgs)
  {
    set_type oldSet = set;
    set = newSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__SET, oldSet, newSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSet(set_type newSet)
  {
    if (newSet != set)
    {
      NotificationChain msgs = null;
      if (set != null)
        msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__SET, null, msgs);
      if (newSet != null)
        msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__SET, null, msgs);
      msgs = basicSetSet(newSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__SET, newSet, newSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public file_type getFile()
  {
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFile(file_type newFile, NotificationChain msgs)
  {
    file_type oldFile = file;
    file = newFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE, oldFile, newFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFile(file_type newFile)
  {
    if (newFile != file)
    {
      NotificationChain msgs = null;
      if (file != null)
        msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE, null, msgs);
      if (newFile != null)
        msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE, null, msgs);
      msgs = basicSetFile(newFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE, newFile, newFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY:
        return basicSetArray(null, msgs);
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__DYNAMIC:
        return basicSetDynamic(null, msgs);
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD:
        return basicSetRecord(null, msgs);
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__SET:
        return basicSetSet(null, msgs);
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE:
        return basicSetFile(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY:
        return getArray();
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__DYNAMIC:
        return getDynamic();
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD:
        return getRecord();
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__SET:
        return getSet();
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE:
        return getFile();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY:
        setArray((array_type)newValue);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__DYNAMIC:
        setDynamic((dynamic_array_type)newValue);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD:
        setRecord((record_type)newValue);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__SET:
        setSet((set_type)newValue);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE:
        setFile((file_type)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY:
        setArray((array_type)null);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__DYNAMIC:
        setDynamic((dynamic_array_type)null);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD:
        setRecord((record_type)null);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__SET:
        setSet((set_type)null);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE:
        setFile((file_type)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY:
        return array != null;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__DYNAMIC:
        return dynamic != null;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD:
        return record != null;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__SET:
        return set != null;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE:
        return file != null;
    }
    return super.eIsSet(featureID);
  }

} //unpacked_structured_typeImpl
