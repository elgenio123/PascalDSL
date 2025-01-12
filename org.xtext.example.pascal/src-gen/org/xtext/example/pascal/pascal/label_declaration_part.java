/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>label declaration part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.label_declaration_part#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getlabel_declaration_part()
 * @model
 * @generated
 */
public interface label_declaration_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.label}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getlabel_declaration_part_Labels()
   * @model containment="true"
   * @generated
   */
  EList<label> getLabels();

} // label_declaration_part
