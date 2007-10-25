/**
 * Created on Nov 4, 2006
 * Created by Thies Edeling
 * Copyright (C) 2005, 2006 te-con, All Rights Reserved.
 *
 * This Software is copyright TE-CON 2007. This Software is not open source by definition. The source of the Software is available for educational purposes.
 * TE-CON holds all the ownership rights on the Software.
 * TE-CON freely grants the right to use the Software. Any reproduction or modification of this Software, whether for commercial use or open source,
 * is subject to obtaining the prior express authorization of TE-CON.
 * thies@te-con.nl
 * TE-CON
 * Legmeerstraat 4-2h, 1058ND, AMSTERDAM, The Netherlands
 *
 */

package net.rrm.ehour.dao;

import java.io.File;
import java.sql.Connection;

import javax.sql.DataSource;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public abstract class BaseDAOTest extends AbstractTransactionalDataSourceSpringContextTests
{
	
	protected String[] getConfigLocations()
	{
		return new String[] { "classpath:applicationContext-dao.xml",
								"classpath:applicationContext-datasource.xml"
		};	
	}	
	
	protected void onSetUpInTransaction() throws Exception
	{
		setUpDatabase();
	}
	

	private void setUpDatabase() throws Exception
	{
		DataSource ds = jdbcTemplate.getDataSource();
		Connection con = DataSourceUtils.getConnection(ds);
		IDatabaseConnection connection = new DatabaseConnection(con);

		IDataSet dataSet = new FlatXmlDataSet(new File("src/test/resources/test-dataset.xml"));
		
		try
		{
			System.out.println("Db setup");
			DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
		} finally
		{
			connection.close();
		}
	}
}
