/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.pascal.pascal.PascalPackage
 * @generated
 */
public interface PascalFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PascalFactory eINSTANCE = org.xtext.example.pascal.pascal.impl.PascalFactoryImpl.init();

  /**
   * Returns a new object of class '<em>pascal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pascal</em>'.
   * @generated
   */
  pascal createpascal();

  /**
   * Returns a new object of class '<em>program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>program</em>'.
   * @generated
   */
  program createprogram();

  /**
   * Returns a new object of class '<em>program heading block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>program heading block</em>'.
   * @generated
   */
  program_heading_block createprogram_heading_block();

  /**
   * Returns a new object of class '<em>identifier list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>identifier list</em>'.
   * @generated
   */
  identifier_list createidentifier_list();

  /**
   * Returns a new object of class '<em>block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>block</em>'.
   * @generated
   */
  block createblock();

  /**
   * Returns a new object of class '<em>statement part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement part</em>'.
   * @generated
   */
  statement_part createstatement_part();

  /**
   * Returns a new object of class '<em>statement sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement sequence</em>'.
   * @generated
   */
  statement_sequence createstatement_sequence();

  /**
   * Returns a new object of class '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement</em>'.
   * @generated
   */
  statement createstatement();

  /**
   * Returns a new object of class '<em>label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>label</em>'.
   * @generated
   */
  label createlabel();

  /**
   * Returns a new object of class '<em>simple statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>simple statement</em>'.
   * @generated
   */
  simple_statement createsimple_statement();

  /**
   * Returns a new object of class '<em>assignment statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>assignment statement</em>'.
   * @generated
   */
  assignment_statement createassignment_statement();

  /**
   * Returns a new object of class '<em>variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable</em>'.
   * @generated
   */
  variable createvariable();

  /**
   * Returns a new object of class '<em>var </em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var </em>'.
   * @generated
   */
  var_ createvar_();

  /**
   * Returns a new object of class '<em>expression list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression list</em>'.
   * @generated
   */
  expression_list createexpression_list();

  /**
   * Returns a new object of class '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression</em>'.
   * @generated
   */
  expression createexpression();

  /**
   * Returns a new object of class '<em>simple expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>simple expression</em>'.
   * @generated
   */
  simple_expression createsimple_expression();

  /**
   * Returns a new object of class '<em>term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>term</em>'.
   * @generated
   */
  term createterm();

  /**
   * Returns a new object of class '<em>factor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>factor</em>'.
   * @generated
   */
  factor createfactor();

  /**
   * Returns a new object of class '<em>number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>number</em>'.
   * @generated
   */
  number createnumber();

  /**
   * Returns a new object of class '<em>any number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>any number</em>'.
   * @generated
   */
  any_number createany_number();

  /**
   * Returns a new object of class '<em>set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>set</em>'.
   * @generated
   */
  set createset();

  /**
   * Returns a new object of class '<em>function designator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function designator</em>'.
   * @generated
   */
  function_designator createfunction_designator();

  /**
   * Returns a new object of class '<em>structured statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>structured statement</em>'.
   * @generated
   */
  structured_statement createstructured_statement();

  /**
   * Returns a new object of class '<em>compound statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>compound statement</em>'.
   * @generated
   */
  compound_statement createcompound_statement();

  /**
   * Returns a new object of class '<em>repetitive statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>repetitive statement</em>'.
   * @generated
   */
  repetitive_statement createrepetitive_statement();

  /**
   * Returns a new object of class '<em>while statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>while statement</em>'.
   * @generated
   */
  while_statement createwhile_statement();

  /**
   * Returns a new object of class '<em>repeat statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>repeat statement</em>'.
   * @generated
   */
  repeat_statement createrepeat_statement();

  /**
   * Returns a new object of class '<em>for statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>for statement</em>'.
   * @generated
   */
  for_statement createfor_statement();

  /**
   * Returns a new object of class '<em>conditional statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>conditional statement</em>'.
   * @generated
   */
  conditional_statement createconditional_statement();

  /**
   * Returns a new object of class '<em>if statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>if statement</em>'.
   * @generated
   */
  if_statement createif_statement();

  /**
   * Returns a new object of class '<em>case statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>case statement</em>'.
   * @generated
   */
  case_statement createcase_statement();

  /**
   * Returns a new object of class '<em>case limb</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>case limb</em>'.
   * @generated
   */
  case_limb createcase_limb();

  /**
   * Returns a new object of class '<em>case label list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>case label list</em>'.
   * @generated
   */
  case_label_list createcase_label_list();

  /**
   * Returns a new object of class '<em>constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant</em>'.
   * @generated
   */
  constant createconstant();

  /**
   * Returns a new object of class '<em>with statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>with statement</em>'.
   * @generated
   */
  with_statement createwith_statement();

  /**
   * Returns a new object of class '<em>goto statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>goto statement</em>'.
   * @generated
   */
  goto_statement creategoto_statement();

  /**
   * Returns a new object of class '<em>label declaration part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>label declaration part</em>'.
   * @generated
   */
  label_declaration_part createlabel_declaration_part();

  /**
   * Returns a new object of class '<em>constant definition part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant definition part</em>'.
   * @generated
   */
  constant_definition_part createconstant_definition_part();

  /**
   * Returns a new object of class '<em>constant definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant definition</em>'.
   * @generated
   */
  constant_definition createconstant_definition();

  /**
   * Returns a new object of class '<em>type definition part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type definition part</em>'.
   * @generated
   */
  type_definition_part createtype_definition_part();

  /**
   * Returns a new object of class '<em>type definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type definition</em>'.
   * @generated
   */
  type_definition createtype_definition();

  /**
   * Returns a new object of class '<em>type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type</em>'.
   * @generated
   */
  type createtype();

  /**
   * Returns a new object of class '<em>simple type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>simple type</em>'.
   * @generated
   */
  simple_type createsimple_type();

  /**
   * Returns a new object of class '<em>subrange type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>subrange type</em>'.
   * @generated
   */
  subrange_type createsubrange_type();

  /**
   * Returns a new object of class '<em>enumerated type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enumerated type</em>'.
   * @generated
   */
  enumerated_type createenumerated_type();

  /**
   * Returns a new object of class '<em>structured type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>structured type</em>'.
   * @generated
   */
  structured_type createstructured_type();

  /**
   * Returns a new object of class '<em>unpacked structured type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unpacked structured type</em>'.
   * @generated
   */
  unpacked_structured_type createunpacked_structured_type();

  /**
   * Returns a new object of class '<em>array type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>array type</em>'.
   * @generated
   */
  array_type createarray_type();

  /**
   * Returns a new object of class '<em>dynamic array type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>dynamic array type</em>'.
   * @generated
   */
  dynamic_array_type createdynamic_array_type();

  /**
   * Returns a new object of class '<em>index type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>index type</em>'.
   * @generated
   */
  index_type createindex_type();

  /**
   * Returns a new object of class '<em>record type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>record type</em>'.
   * @generated
   */
  record_type createrecord_type();

  /**
   * Returns a new object of class '<em>field list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>field list</em>'.
   * @generated
   */
  field_list createfield_list();

  /**
   * Returns a new object of class '<em>fixed part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>fixed part</em>'.
   * @generated
   */
  fixed_part createfixed_part();

  /**
   * Returns a new object of class '<em>variable identifier list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable identifier list</em>'.
   * @generated
   */
  variable_identifier_list createvariable_identifier_list();

  /**
   * Returns a new object of class '<em>variable section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable section</em>'.
   * @generated
   */
  variable_section createvariable_section();

  /**
   * Returns a new object of class '<em>record section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>record section</em>'.
   * @generated
   */
  record_section createrecord_section();

  /**
   * Returns a new object of class '<em>variant part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variant part</em>'.
   * @generated
   */
  variant_part createvariant_part();

  /**
   * Returns a new object of class '<em>tag field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tag field</em>'.
   * @generated
   */
  tag_field createtag_field();

  /**
   * Returns a new object of class '<em>variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variant</em>'.
   * @generated
   */
  variant createvariant();

  /**
   * Returns a new object of class '<em>set type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>set type</em>'.
   * @generated
   */
  set_type createset_type();

  /**
   * Returns a new object of class '<em>file type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>file type</em>'.
   * @generated
   */
  file_type createfile_type();

  /**
   * Returns a new object of class '<em>pointer type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pointer type</em>'.
   * @generated
   */
  pointer_type createpointer_type();

  /**
   * Returns a new object of class '<em>variable declaration part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable declaration part</em>'.
   * @generated
   */
  variable_declaration_part createvariable_declaration_part();

  /**
   * Returns a new object of class '<em>procedure and function declaration part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>procedure and function declaration part</em>'.
   * @generated
   */
  procedure_and_function_declaration_part createprocedure_and_function_declaration_part();

  /**
   * Returns a new object of class '<em>abstraction declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>abstraction declaration</em>'.
   * @generated
   */
  abstraction_declaration createabstraction_declaration();

  /**
   * Returns a new object of class '<em>abstraction heading</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>abstraction heading</em>'.
   * @generated
   */
  abstraction_heading createabstraction_heading();

  /**
   * Returns a new object of class '<em>formal parameter list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>formal parameter list</em>'.
   * @generated
   */
  formal_parameter_list createformal_parameter_list();

  /**
   * Returns a new object of class '<em>formal parameter section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>formal parameter section</em>'.
   * @generated
   */
  formal_parameter_section createformal_parameter_section();

  /**
   * Returns a new object of class '<em>value parameter section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>value parameter section</em>'.
   * @generated
   */
  value_parameter_section createvalue_parameter_section();

  /**
   * Returns a new object of class '<em>parameter type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter type</em>'.
   * @generated
   */
  parameter_type createparameter_type();

  /**
   * Returns a new object of class '<em>conformant array schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>conformant array schema</em>'.
   * @generated
   */
  conformant_array_schema createconformant_array_schema();

  /**
   * Returns a new object of class '<em>packed conformant array schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>packed conformant array schema</em>'.
   * @generated
   */
  packed_conformant_array_schema createpacked_conformant_array_schema();

  /**
   * Returns a new object of class '<em>bound specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bound specification</em>'.
   * @generated
   */
  bound_specification createbound_specification();

  /**
   * Returns a new object of class '<em>unpacked conformant array schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unpacked conformant array schema</em>'.
   * @generated
   */
  unpacked_conformant_array_schema createunpacked_conformant_array_schema();

  /**
   * Returns a new object of class '<em>variable parameter section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable parameter section</em>'.
   * @generated
   */
  variable_parameter_section createvariable_parameter_section();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PascalPackage getPascalPackage();

} //PascalFactory
