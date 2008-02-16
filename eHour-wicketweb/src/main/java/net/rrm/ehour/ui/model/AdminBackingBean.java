/**
 * Created on Aug 19, 2007
 * Created by Thies Edeling
 * Copyright (C) 2005, 2006 te-con, All Rights Reserved.
 *
 * This Software is copyright TE-CON 2007. This Software is not open source by definition. The source of the Software is available for educational purposes.
 * TE-CON holds all the ownership rights on the Software.
 * TE-CON freely grants the right to use the Software. Any reproduction or modification of this Software, whether for commercial use or open source,
 * is subject to obtaining the prior express authorization of TE-CON.
 * 
 * thies@te-con.nl
 * TE-CON
 * Legmeerstraat 4-2h, 1058ND, AMSTERDAM, The Netherlands
 *
 */

package net.rrm.ehour.ui.model;

import java.io.Serializable;

/**
 * Backing bean interface for the admin screens. 
 **/

public abstract class AdminBackingBean implements Serializable
{
	private String	serverMessage;

	/**
	 * @return the serverMessage
	 */
	public String getServerMessage()
	{
		return serverMessage;
	}

	/**
	 * @param serverMessage the serverMessage to set
	 */
	public void setServerMessage(String serverMessage)
	{
		this.serverMessage = serverMessage;
	}	
	
}
