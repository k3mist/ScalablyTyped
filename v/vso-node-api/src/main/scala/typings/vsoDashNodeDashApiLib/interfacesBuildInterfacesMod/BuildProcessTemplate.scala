package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildProcessTemplate extends js.Object {
  var description: java.lang.String
  var fileExists: scala.Boolean
  var id: scala.Double
  var parameters: java.lang.String
  var serverPath: java.lang.String
  var supportedReasons: BuildReason
  var teamProject: java.lang.String
  var templateType: ProcessTemplateType
  var url: java.lang.String
  var version: java.lang.String
}

object BuildProcessTemplate {
  @scala.inline
  def apply(
    description: java.lang.String,
    fileExists: scala.Boolean,
    id: scala.Double,
    parameters: java.lang.String,
    serverPath: java.lang.String,
    supportedReasons: BuildReason,
    teamProject: java.lang.String,
    templateType: ProcessTemplateType,
    url: java.lang.String,
    version: java.lang.String
  ): BuildProcessTemplate = {
    val __obj = js.Dynamic.literal(description = description, fileExists = fileExists, id = id, parameters = parameters, serverPath = serverPath, supportedReasons = supportedReasons, teamProject = teamProject, templateType = templateType, url = url, version = version)
  
    __obj.asInstanceOf[BuildProcessTemplate]
  }
}

