package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynArrayOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u201/12322/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Saturday, December 15, 2018 6:38:38 PM PST
*/


/**
    * DynArray objects support the manipulation of IDL arrays.
    * Note that the dimension of the array is contained in the TypeCode which is accessible
    * through the type attribute. It can also be obtained by calling the component_count operation.
    */
public interface DynArrayOperations  extends DynAnyOperations
{

  /**
        * Returns the elements of the DynArray.
        */
  org.omg.CORBA.Any[] get_elements();

  /**
        * Sets the DynArray to contain the passed elements.
        *
        * @exception TypeMismatch if one or more elements have a type that is inconsistent with the DynArrays TypeCode
        * @exception InvalidValue if the sequence does not contain the same number of elements as the array dimension
        */
  void set_elements(org.omg.CORBA.Any[] value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue;

  /**
        * Returns the elements of the DynArray as DynAnys.
        */
  DynAny[] get_elements_as_dyn_any();

  /**
        * Sets the DynArray to contain the passed elements.
        *
        * @exception TypeMismatch if one or more elements have a type that is inconsistent with the DynArrays TypeCode
        * @exception InvalidValue if the sequence does not contain the same number of elements as the array dimension
        */
  void set_elements_as_dyn_any(DynAny[] value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue;
} // interface DynArrayOperations