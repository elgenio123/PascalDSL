/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.set#getBrackets <em>Brackets</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.set#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getset()
 * @model
 * @generated
 */
public interface set extends EObject
{
  /**
   * Returns the value of the '<em><b>Brackets</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Brackets</em>' attribute list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getset_Brackets()
   * @model unique="false"
   * @generated
   */
  EList<String> getBrackets();

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference.
   * @see #setExpressions(expression_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getset_Expressions()
   * @model containment="true"
   * @generated
   */
  expression_list getExpressions();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.set#getExpressions <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressions</em>' containment reference.
   * @see #getExpressions()
   * @generated
   */
  void setExpressions(expression_list value);

} // set
