/*
 * Copyright (c) 1999, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.omg.CORBA;


/**
* The Helper for <tt>FloatSeq</tt>.  For more information on
* Helper files, see <a href="doc-files/generatedfiles.html#helper">
* "Generated Files: Helper Files"</a>.<P>
* org/omg/CORBA/FloatSeqHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from streams.idl
* 13 May 1999 22:41:37 o'clock GMT+00:00
*
* The class definition has been modified to conform to the following
* OMG specifications :
*   <ul>
*       <li> ORB core as defined by CORBA 2.3.1
*       (<a href="http://cgi.omg.org/cgi-bin/doc?formal/99-10-07">formal/99-10-07</a>)
*       </li>
*
*       <li> IDL/Java Language Mapping as defined in
*       <a href="http://cgi.omg.org/cgi-bin/doc?ptc/00-01-08">ptc/00-01-08</a>
*       </li>
*   </ul>
*/

public abstract class FloatSeqHelper
{
    private static String  _id = "IDL:omg.org/CORBA/FloatSeq:1.0";

    public static void insert (Any a, float[] that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    public static float[] extract (Any a)
    {
        return read (a.create_input_stream ());
    }

    private static TypeCode __typeCode = null;
    synchronized public static TypeCode type ()
    {
        if (__typeCode == null)
            {
                __typeCode = ORB.init ().get_primitive_tc (TCKind.tk_float);
                __typeCode = ORB.init ().create_sequence_tc (0, __typeCode);
                __typeCode = ORB.init ().create_alias_tc (FloatSeqHelper.id (), "FloatSeq", __typeCode);
            }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    public static float[] read (org.omg.CORBA.portable.InputStream istream)
    {
        float value[] = null;
        int _len0 = istream.read_long ();
        value = new float[_len0];
        istream.read_float_array (value, 0, _len0);
        return value;
    }

    public static void write (org.omg.CORBA.portable.OutputStream ostream, float[] value)
    {
        ostream.write_long (value.length);
        ostream.write_float_array (value, 0, value.length);
    }

}