package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataLookup extends js.Object {
  /**
    * Determines how this lookup matches the location.  If this field is
    * specified as EXACT, only developer metadata associated on the exact
    * location specified is matched.  If this field is specified to INTERSECTING,
    * developer metadata associated on intersecting locations is also
    * matched.  If left unspecified, this field assumes a default value of
    * INTERSECTING.
    * If this field is specified, a metadataLocation
    * must also be specified.
    */
  var locationMatchingStrategy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Limits the selected developer metadata to those entries which are
    * associated with locations of the specified type.  For example, when this
    * field is specified as ROW this lookup
    * only considers developer metadata associated on rows.  If the field is left
    * unspecified, all location types are considered.  This field cannot be
    * specified as SPREADSHEET when
    * the locationMatchingStrategy
    * is specified as INTERSECTING or when the
    * metadataLocation is specified as a
    * non-spreadsheet location: spreadsheet metadata cannot intersect any other
    * developer metadata location.  This field also must be left unspecified when
    * the locationMatchingStrategy
    * is specified as EXACT.
    */
  var locationType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Limits the selected developer metadata to that which has a matching
    * DeveloperMetadata.metadata_id.
    */
  var metadataId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Limits the selected developer metadata to that which has a matching
    * DeveloperMetadata.metadata_key.
    */
  var metadataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Limits the selected developer metadata to those entries associated with
    * the specified location.  This field either matches exact locations or all
    * intersecting locations according the specified
    * locationMatchingStrategy.
    */
  var metadataLocation: js.UndefOr[DeveloperMetadataLocation] = js.undefined
  /**
    * Limits the selected developer metadata to that which has a matching
    * DeveloperMetadata.metadata_value.
    */
  var metadataValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Limits the selected developer metadata to that which has a matching
    * DeveloperMetadata.visibility.  If left unspecified, all developer
    * metadata visibile to the requesting project is considered.
    */
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object DeveloperMetadataLookup {
  @scala.inline
  def apply(
    locationMatchingStrategy: java.lang.String = null,
    locationType: java.lang.String = null,
    metadataId: scala.Int | scala.Double = null,
    metadataKey: java.lang.String = null,
    metadataLocation: DeveloperMetadataLocation = null,
    metadataValue: java.lang.String = null,
    visibility: java.lang.String = null
  ): DeveloperMetadataLookup = {
    val __obj = js.Dynamic.literal()
    if (locationMatchingStrategy != null) __obj.updateDynamic("locationMatchingStrategy")(locationMatchingStrategy)
    if (locationType != null) __obj.updateDynamic("locationType")(locationType)
    if (metadataId != null) __obj.updateDynamic("metadataId")(metadataId.asInstanceOf[js.Any])
    if (metadataKey != null) __obj.updateDynamic("metadataKey")(metadataKey)
    if (metadataLocation != null) __obj.updateDynamic("metadataLocation")(metadataLocation)
    if (metadataValue != null) __obj.updateDynamic("metadataValue")(metadataValue)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[DeveloperMetadataLookup]
  }
}

