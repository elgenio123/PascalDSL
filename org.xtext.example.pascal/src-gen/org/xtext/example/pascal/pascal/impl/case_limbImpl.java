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
import org.xtext.example.pascal.pascal.case_label_list;
import org.xtext.example.pascal.pascal.case_limb;
import org.xtext.example.pascal.pascal.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>case limb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.case_limbImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.case_limbImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class case_limbImpl extends MinimalEObjectImpl.Container implements case_limb
{
  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected case_label_list cases;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected statement statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected case_limbImpl()
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
    return PascalPackage.Literals.CASE_LIMB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public case_label_list getCases()
  {
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCases(case_label_list newCases, NotificationChain msgs)
  {
    case_label_list oldCases = cases;
    cases = newCases;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CASE_LIMB__CASES, oldCases, newCases);
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
  public void setCases(case_label_list newCases)
  {
    if (newCases != cases)
    {
      NotificationChain msgs = null;
      if (cases != null)
        msgs = ((InternalEObject)cases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CASE_LIMB__CASES, null, msgs);
      if (newCases != null)
        msgs = ((InternalEObject)newCases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CASE_LIMB__CASES, null, msgs);
      msgs = basicSetCases(newCases, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CASE_LIMB__CASES, newCases, newCases));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(statement newStatement, NotificationChain msgs)
  {
    statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CASE_LIMB__STATEMENT, oldStatement, newStatement);
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
  public void setStatement(statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CASE_LIMB__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CASE_LIMB__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CASE_LIMB__STATEMENT, newStatement, newStatement));
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
      case PascalPackage.CASE_LIMB__CASES:
        return basicSetCases(null, msgs);
      case PascalPackage.CASE_LIMB__STATEMENT:
        return basicSetStatement(null, msgs);
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
      case PascalPackage.CASE_LIMB__CASES:
        return getCases();
      case PascalPackage.CASE_LIMB__STATEMENT:
        return getStatement();
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
      case PascalPackage.CASE_LIMB__CASES:
        setCases((case_label_list)newValue);
        return;
      case PascalPackage.CASE_LIMB__STATEMENT:
        setStatement((statement)newValue);
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
      case PascalPackage.CASE_LIMB__CASES:
        setCases((case_label_list)null);
        return;
      case PascalPackage.CASE_LIMB__STATEMENT:
        setStatement((statement)null);
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
      case PascalPackage.CASE_LIMB__CASES:
        return cases != null;
      case PascalPackage.CASE_LIMB__STATEMENT:
        return statement != null;
    }
    return super.eIsSet(featureID);
  }

} //case_limbImpl
