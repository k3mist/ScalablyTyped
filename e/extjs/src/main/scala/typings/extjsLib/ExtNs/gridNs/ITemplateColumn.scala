package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplateColumn
  extends extjsLib.ExtNs.gridNs.columnNs.IColumn {
  /** [Method] When defined this will take precedence over the renderer config
  		* @param value Object
  		* @param meta Object
  		* @param record Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_ITemplateColumn: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

object ITemplateColumn {
  @scala.inline
  def apply(
    IColumn: extjsLib.ExtNs.gridNs.columnNs.IColumn = null,
    defaultRenderer: js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    tpl: js.Any = null
  ): ITemplateColumn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(defaultRenderer)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[ITemplateColumn]
  }
}

