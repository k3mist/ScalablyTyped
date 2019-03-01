package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionEnvironmentTemplate extends js.Object {
  var canDelete: scala.Boolean
  var category: java.lang.String
  var description: java.lang.String
  var environment: ReleaseDefinitionEnvironment
  var iconTaskId: java.lang.String
  var iconUri: java.lang.String
  var id: java.lang.String
  var isDeleted: scala.Boolean
  var name: java.lang.String
}

object ReleaseDefinitionEnvironmentTemplate {
  @scala.inline
  def apply(
    canDelete: scala.Boolean,
    category: java.lang.String,
    description: java.lang.String,
    environment: ReleaseDefinitionEnvironment,
    iconTaskId: java.lang.String,
    iconUri: java.lang.String,
    id: java.lang.String,
    isDeleted: scala.Boolean,
    name: java.lang.String
  ): ReleaseDefinitionEnvironmentTemplate = {
    val __obj = js.Dynamic.literal(canDelete = canDelete, category = category, description = description, environment = environment, iconTaskId = iconTaskId, iconUri = iconUri, id = id, isDeleted = isDeleted, name = name)
  
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentTemplate]
  }
}

