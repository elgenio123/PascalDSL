/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>array type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.array_type#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.array_type#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getarray_type()
 * @model
 * @generated
 */
public interface array_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.index_type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indexes</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getarray_type_Indexes()
   * @model containment="true"
   * @generated
   */
  EList<index_type> getIndexes();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(type)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getarray_type_Type()
   * @model containment="true"
   * @generated
   */
  type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.array_type#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type value);

} // array_type
