package net.jahhan.intf.swagger;

import javax.servlet.ServletConfig;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/swagger")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ MediaType.APPLICATION_JSON + "; " + "charset=UTF-8", MediaType.TEXT_XML + "; " + "charset=UTF-8" })
public interface SwaggerService {

	@GET
	public Response getListingJson(@Context Application app, @Context ServletConfig sc, @Context HttpHeaders headers,
			@Context UriInfo uriInfo);
}
