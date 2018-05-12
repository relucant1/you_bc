/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.YouBc;
import com.youbc.generated.schema.tables.records.FacultiesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Faculties extends TableImpl<FacultiesRecord> {

    private static final long serialVersionUID = 369185133;

    /**
     * The reference instance of <code>you_bc.faculties</code>
     */
    public static final Faculties FACULTIES = new Faculties();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FacultiesRecord> getRecordType() {
        return FacultiesRecord.class;
    }

    /**
     * The column <code>you_bc.faculties.id</code>.
     */
    public final TableField<FacultiesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>you_bc.faculties.faculty</code>.
     */
    public final TableField<FacultiesRecord, String> FACULTY = createField("faculty", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>you_bc.faculties</code> table reference
     */
    public Faculties() {
        this("faculties", null);
    }

    /**
     * Create an aliased <code>you_bc.faculties</code> table reference
     */
    public Faculties(String alias) {
        this(alias, FACULTIES);
    }

    private Faculties(String alias, Table<FacultiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Faculties(String alias, Table<FacultiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return YouBc.YOU_BC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FacultiesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FACULTIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FacultiesRecord> getPrimaryKey() {
        return Keys.KEY_FACULTIES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FacultiesRecord>> getKeys() {
        return Arrays.<UniqueKey<FacultiesRecord>>asList(Keys.KEY_FACULTIES_PRIMARY, Keys.KEY_FACULTIES_FACULTY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Faculties as(String alias) {
        return new Faculties(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Faculties rename(String name) {
        return new Faculties(name, null);
    }
}
