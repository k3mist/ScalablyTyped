package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.macroResource
  * @description Deals with data for macros
  *
  **/
trait IMacroResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.macroResource#getMacroParameters
    * @methodOf umbraco.resources.macroResource
    *
    * @description
    * Gets the editable macro parameters for the specified macro alias
    *
    * @param {int} macroId The macro id to get parameters for
    *
    */
  def getMacroParameters(macroId: scala.Double): js.Any
  /**
    * @ngdoc method
    * @name umbraco.resources.macroResource#getMacroResult
    * @methodOf umbraco.resources.macroResource
    *
    * @description
    * Gets the result of a macro as html to display in the rich text editor
    *
    * @param {int} macroId The macro id to get parameters for
    * @param {int} pageId The current page id
    * @param {Array} macroParamDictionary A dictionary of macro parameters
    *
    */
  def getMacroResultAsHtmlForEditor(macroId: scala.Double, pageId: scala.Double, macroParamDictionary: js.Array[_]): js.Any
}

object IMacroResource {
  @scala.inline
  def apply(
    getMacroParameters: js.Function1[scala.Double, js.Any],
    getMacroResultAsHtmlForEditor: js.Function3[scala.Double, scala.Double, js.Array[_], js.Any]
  ): IMacroResource = {
    val __obj = js.Dynamic.literal(getMacroParameters = getMacroParameters, getMacroResultAsHtmlForEditor = getMacroResultAsHtmlForEditor)
  
    __obj.asInstanceOf[IMacroResource]
  }
}

