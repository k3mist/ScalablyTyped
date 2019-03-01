package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension
  extends /**
	 * Option for IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the measures dimension.
  	 * The default value is "Measures".
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of measure metadata objects.
  	 */
  var measures: js.UndefOr[
    js.Array[
      IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure
    ]
  ] = js.undefined
  /**
  	 * A unique name for the measures dimension.
  	 * The default value is "Measures". This name is used to create the names of dimensions using the following pattern:
  	 * [<measuresDimensionMetadata.name>].[<measureMetadata.name>]
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    caption: java.lang.String = null,
    measures: js.Array[
      IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure
    ] = null,
    name: java.lang.String = null
  ): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (measures != null) __obj.updateDynamic("measures")(measures)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension]
  }
}

