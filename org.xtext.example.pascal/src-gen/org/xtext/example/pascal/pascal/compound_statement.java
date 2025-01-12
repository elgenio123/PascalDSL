/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compound statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.compound_statement#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getcompound_statement()
 * @model
 * @generated
 */
public interface compound_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' containment reference.
   * @see #setSequence(statement_sequence)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getcompound_statement_Sequence()
   * @model containment="true"
   * @generated
   */
  statement_sequence getSequence();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.compound_statement#getSequence <em>Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' containment reference.
   * @see #getSequence()
   * @generated
   */
  void setSequence(statement_sequence value);

} // compound_statement
