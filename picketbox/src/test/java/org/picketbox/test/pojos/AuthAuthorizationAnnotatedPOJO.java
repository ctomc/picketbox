/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors. 
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.picketbox.test.pojos;

import org.jboss.security.annotation.Authentication;
import org.jboss.security.annotation.Authorization;
import org.jboss.security.annotation.Module;
import org.jboss.security.annotation.ModuleOption;
import org.jboss.security.auth.spi.UsersRolesLoginModule;
import org.picketbox.plugins.authorization.PicketBoxAuthorizationModule;

/**
 * POJO with both Authentication and Authorization
 * annotations
 * @author Anil.Saldhana@redhat.com
 * @since Mar 4, 2010
 */
@Authentication(modules={@Module(code = UsersRolesLoginModule.class, options =
{@ModuleOption})})
@Authorization(modules ={@Module(code = PicketBoxAuthorizationModule.class, options =
{@ModuleOption(key="roles",value="validuser")})})
public class AuthAuthorizationAnnotatedPOJO
{
   
}