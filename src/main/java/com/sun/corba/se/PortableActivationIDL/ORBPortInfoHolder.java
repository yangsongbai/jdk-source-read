package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ORBPortInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u201/12322/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Saturday, December 15, 2018 6:38:37 PM PST
*/

public final class ORBPortInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public ORBPortInfo value = null;

  public ORBPortInfoHolder ()
  {
  }

  public ORBPortInfoHolder (ORBPortInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ORBPortInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ORBPortInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ORBPortInfoHelper.type ();
  }

}
