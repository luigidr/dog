/**
 * 
 */
package it.polito.elite.dog.system.bundle.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author bonino
 *
 */
@Path("/system/bundles/")
public interface BundleManagerInterface
{
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String getBundles();
}
