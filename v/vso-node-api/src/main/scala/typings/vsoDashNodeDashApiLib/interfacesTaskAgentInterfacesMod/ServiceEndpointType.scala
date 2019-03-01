package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointType extends js.Object {
  var authenticationSchemes: js.Array[ServiceEndpointAuthenticationScheme]
  var dataSources: js.Array[DataSource]
  var dependencyData: js.Array[DependencyData]
  var description: java.lang.String
  var displayName: java.lang.String
  var endpointUrl: EndpointUrl
  var helpLink: HelpLink
  var helpMarkDown: java.lang.String
  var iconUrl: java.lang.String
  var inputDescriptors: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDescriptor]
  var name: java.lang.String
}

object ServiceEndpointType {
  @scala.inline
  def apply(
    authenticationSchemes: js.Array[ServiceEndpointAuthenticationScheme],
    dataSources: js.Array[DataSource],
    dependencyData: js.Array[DependencyData],
    description: java.lang.String,
    displayName: java.lang.String,
    endpointUrl: EndpointUrl,
    helpLink: HelpLink,
    helpMarkDown: java.lang.String,
    iconUrl: java.lang.String,
    inputDescriptors: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDescriptor],
    name: java.lang.String
  ): ServiceEndpointType = {
    val __obj = js.Dynamic.literal(authenticationSchemes = authenticationSchemes, dataSources = dataSources, dependencyData = dependencyData, description = description, displayName = displayName, endpointUrl = endpointUrl, helpLink = helpLink, helpMarkDown = helpMarkDown, iconUrl = iconUrl, inputDescriptors = inputDescriptors, name = name)
  
    __obj.asInstanceOf[ServiceEndpointType]
  }
}

