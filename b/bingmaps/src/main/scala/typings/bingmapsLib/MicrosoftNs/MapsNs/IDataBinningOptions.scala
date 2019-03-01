package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataBinningOptions extends js.Object {
  /* The name of a property in the Pushpin.metadata object on which to perform calculations (average, count, sum) against the pushpins in each data bin. */
  var aggregationProperty: js.UndefOr[java.lang.String] = js.undefined
  /*
    * A callback function which defines the color a data bin polygon should be. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a color value.
    */
  var colorCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      java.lang.String | Color
    ]
  ] = js.undefined
  /* The shape of the data bin to generate. Default: hexagon */
  var dataBinType: js.UndefOr[DataBinType] = js.undefined
  /* The distance units of the radius option. Default: meters */
  var distanceUnits: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits] = js.undefined
  /* The default options used for rendering the data bin polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.undefined
  /*
    * A spatial distance which will be converted into a pixel distance at the equater and used to generate symetrically sized data bins
    * that have the apprimate spatial distance radius. Default: 1000
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /*
    * A callback function which defines how much to scale a data bins size. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a number between 0 and 1.
    */
  var scaleCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      scala.Double
    ]
  ] = js.undefined
}

object IDataBinningOptions {
  @scala.inline
  def apply(
    aggregationProperty: java.lang.String = null,
    colorCallback: js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      java.lang.String | Color
    ] = null,
    dataBinType: DataBinType = null,
    distanceUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits = null,
    polygonOptions: IPolygonOptions = null,
    radius: scala.Int | scala.Double = null,
    scaleCallback: js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      scala.Double
    ] = null
  ): IDataBinningOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregationProperty != null) __obj.updateDynamic("aggregationProperty")(aggregationProperty)
    if (colorCallback != null) __obj.updateDynamic("colorCallback")(colorCallback)
    if (dataBinType != null) __obj.updateDynamic("dataBinType")(dataBinType)
    if (distanceUnits != null) __obj.updateDynamic("distanceUnits")(distanceUnits)
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (scaleCallback != null) __obj.updateDynamic("scaleCallback")(scaleCallback)
    __obj.asInstanceOf[IDataBinningOptions]
  }
}

