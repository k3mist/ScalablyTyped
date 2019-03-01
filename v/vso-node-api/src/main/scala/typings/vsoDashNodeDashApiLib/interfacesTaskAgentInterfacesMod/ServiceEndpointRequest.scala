package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointRequest extends js.Object {
  var dataSourceDetails: DataSourceDetails
  var resultTransformationDetails: ResultTransformationDetails
  var serviceEndpointDetails: ServiceEndpointDetails
}

object ServiceEndpointRequest {
  @scala.inline
  def apply(
    dataSourceDetails: DataSourceDetails,
    resultTransformationDetails: ResultTransformationDetails,
    serviceEndpointDetails: ServiceEndpointDetails
  ): ServiceEndpointRequest = {
    val __obj = js.Dynamic.literal(dataSourceDetails = dataSourceDetails, resultTransformationDetails = resultTransformationDetails, serviceEndpointDetails = serviceEndpointDetails)
  
    __obj.asInstanceOf[ServiceEndpointRequest]
  }
}

