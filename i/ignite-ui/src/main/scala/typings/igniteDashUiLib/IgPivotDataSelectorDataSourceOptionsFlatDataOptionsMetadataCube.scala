package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube
  extends /**
	 * Option for IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the cube.
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of dimension metadata objects.
  	 */
  var dimensions: js.UndefOr[
    js.Array[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension]
  ] = js.undefined
  /**
  	 * An object providing information about the measures' root node.
  	 */
  var measuresDimension: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension] = js.undefined
  /**
  	 * Optional="false" A unique name for the cube.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    caption: java.lang.String = null,
    dimensions: js.Array[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension] = null,
    measuresDimension: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension = null,
    name: java.lang.String = null
  ): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (measuresDimension != null) __obj.updateDynamic("measuresDimension")(measuresDimension)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube]
  }
}

