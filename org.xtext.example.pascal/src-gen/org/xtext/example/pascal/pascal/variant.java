/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.variant#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.variant#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getvariant()
 * @model
 * @generated
 */
public interface variant extends EObject
{
  /**
   * Returns the value of the '<em><b>Labels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' containment reference.
   * @see #setLabels(case_label_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariant_Labels()
   * @model containment="true"
   * @generated
   */
  case_label_list getLabels();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.variant#getLabels <em>Labels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Labels</em>' containment reference.
   * @see #getLabels()
   * @generated
   */
  void setLabels(case_label_list value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference.
   * @see #setFields(field_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariant_Fields()
   * @model containment="true"
   * @generated
   */
  field_list getFields();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.variant#getFields <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fields</em>' containment reference.
   * @see #getFields()
   * @generated
   */
  void setFields(field_list value);

} // variant
