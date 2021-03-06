/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.records;


import com.youbc.generated.schema.tables.ClassmatesTags;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClassmatesTagsRecord extends UpdatableRecordImpl<ClassmatesTagsRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1591921176;

    /**
     * Setter for <code>you_bc.classmates_tags.id</code>.
     */
    public ClassmatesTagsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>you_bc.classmates_tags.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>you_bc.classmates_tags.tag</code>.
     */
    public ClassmatesTagsRecord setTag(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>you_bc.classmates_tags.tag</code>.
     */
    public String getTag() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ClassmatesTags.CLASSMATES_TAGS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ClassmatesTags.CLASSMATES_TAGS.TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesTagsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesTagsRecord value2(String value) {
        setTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesTagsRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClassmatesTagsRecord
     */
    public ClassmatesTagsRecord() {
        super(ClassmatesTags.CLASSMATES_TAGS);
    }

    /**
     * Create a detached, initialised ClassmatesTagsRecord
     */
    public ClassmatesTagsRecord(Integer id, String tag) {
        super(ClassmatesTags.CLASSMATES_TAGS);

        set(0, id);
        set(1, tag);
    }
}
