/*
 * #%L
 * REST Trie
 * %%
 * Copyright (C) 2015 Miguel Reboiro-Jato
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
package es.uvigo.ei.sing.resttrie;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import es.uvigo.ei.sing.resttrie.service.InfixService;
import es.uvigo.ei.sing.resttrie.service.PrefixService;
import es.uvigo.ei.sing.resttrie.service.WordService;

@ApplicationPath("api")
public class PanDrugsDBPublicApplication extends ResourceConfig {
	public PanDrugsDBPublicApplication() {
		super(WordService.class, PrefixService.class, InfixService.class);
		
		register(RequestContextFilter.class);
	}
}
