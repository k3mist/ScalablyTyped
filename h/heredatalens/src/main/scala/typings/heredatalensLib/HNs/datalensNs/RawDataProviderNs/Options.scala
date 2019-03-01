package typings
package heredatalensLib.HNs.datalensNs.RawDataProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Defines how the input data is mapped to an array of GeoJSON features */
  var dataToFeatures: js.UndefOr[js.Function1[/* obj */ js.Any, js.Array[Feature]]] = js.undefined
  /** The data url to fetch */
  var dataUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Defines how GeoJSON features on a tile should be mapped to data rows, which are inputs to layers such as ObjectLayer and HeatmapLayer */
  var featuresToRows: js.UndefOr[
    js.Function6[
      /* features */ js.Array[Feature], 
      /* x */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.X, 
      /* y */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Y, 
      /* z */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, 
      /* tileSize */ TileSize, 
      /* helpers */ Helpers, 
      js.Array[heredatalensLib.HNs.datalensNs.ObjectLayerNs.Row]
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dataToFeatures: js.Function1[/* obj */ js.Any, js.Array[Feature]] = null,
    dataUrl: java.lang.String = null,
    featuresToRows: js.Function6[
      /* features */ js.Array[Feature], 
      /* x */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.X, 
      /* y */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Y, 
      /* z */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, 
      /* tileSize */ TileSize, 
      /* helpers */ Helpers, 
      js.Array[heredatalensLib.HNs.datalensNs.ObjectLayerNs.Row]
    ] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dataToFeatures != null) __obj.updateDynamic("dataToFeatures")(dataToFeatures)
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl)
    if (featuresToRows != null) __obj.updateDynamic("featuresToRows")(featuresToRows)
    __obj.asInstanceOf[Options]
  }
}

