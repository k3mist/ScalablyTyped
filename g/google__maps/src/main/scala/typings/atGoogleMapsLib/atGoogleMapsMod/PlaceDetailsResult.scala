package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceDetailsResult extends js.Object {
  /**
    * is an array containing the separate components applicable to this address.
    *
    * Note the following facts about the `address_components[]` array:
    *  - The array of address components may contain more components than the `formatted_address`.
    *  - The array does not necessarily include all the political entities that contain an address,
    *    apart from those included in the `formatted_address`. To retrieve all the political entities
    *    that contain a specific address, you should use reverse geocoding, passing the latitude/longitude
    *    of the address as a parameter to the request.
    *  - The format of the response is not guaranteed to remain the same between requests.
    *    In particular, the number of `address_components` varies based on the address requested
    *    and can change over time for the same address. A component can change position in the array.
    *    The type of the component can change. A particular component may be missing in a later response.
    */
  var address_components: js.Array[AddressComponent]
  /** is a representation of the place's address in the [adr microformat](http://microformats.org/wiki/adr). */
  var adr_address: java.lang.String
  /**
    * An array of zero, one or more alternative place IDs for the place, with a scope related to each alternative ID.
    * Note: This array may be empty or not present.
    */
  var alt_ids: js.Array[AlternativePlaceId]
  /**
    * is a string containing the human-readable address of this place.
    *
    * Often this address is equivalent to the postal address. Note that some countries, such as the United Kingdom,
    * do not allow distribution of true postal addresses due to licensing restrictions.
    *
    * The formatted address is logically composed of one or more address components.
    * For example, the address "111 8th Avenue, New York, NY" consists of the following components: "111"
    * (the street number), "8th Avenue" (the route), "New York" (the city) and "NY" (the US state).
    *
    * Do not parse the formatted address programmatically. Instead you should use the individual address components,
    * which the API response includes in addition to the formatted address field.
    */
  var formatted_address: java.lang.String
  /**
    * contains the place's phone number in its local format.
    * For example, the `formatted_phone_number` for Google's Sydney, Australia office is `(02) 9374 4000`.
    */
  var formatted_phone_number: java.lang.String
  /**
    * contains the following information:
    *  - `location`: contains the geocoded latitude,longitude value for this place.
    *  - `viewport`: contains the preferred viewport when displaying this place on a map as a `LatLngBounds` if it is known.
    */
  var geometry: AddressGeometry
  /** contains the URL of a suggested icon which may be displayed to the user when indicating this result on a map. */
  var icon: java.lang.String
  /**
    * contains the place's phone number in international format.
    * International format includes the country code, and is prefixed with the plus (+) sign.
    * For example, the `international_phone_number` for Google's Sydney, Australia office is `+61 2 9374 4000`.
    */
  var international_phone_number: java.lang.String
  /**
    * contains the human-readable name for the returned result.
    * For establishment results, this is usually the canonicalized business name.
    */
  var name: java.lang.String
  /** place opening hours. */
  var opening_hours: OpeningHours
  /**
    * is a boolean flag indicating whether the place has permanently shut down (value `true`).
    * If the place is not permanently closed, the flag is absent from the response.
    */
  var permanently_closed: scala.Boolean
  /**
    * an array of photo objects, each containing a reference to an image.
    * A Place Details request may return up to ten photos.
    * More information about place photos and how you can use the images in your application can be found in the Place Photos documentation.
    */
  var photos: js.Array[PlacePhoto]
  /**
    * A textual identifier that uniquely identifies a place.
    * To retrieve information about the place, pass this identifier in the `placeId` field of a Places API request.
    */
  var place_id: java.lang.String
  /**
    * is an encoded location reference, derived from latitude and longitude coordinates, that represents an area:
    * 1/8000th of a degree by 1/8000th of a degree (about 14m x 14m at the equator) or smaller.
    * Plus codes can be used as a replacement for street addresses in places where they do not exist
    * (where buildings are not numbered or streets are not named).
    *
    * The plus code is formatted as a global code and a compound code:
    *  - `global_code` is a 4 character area code and 6 character or longer local code (849VCWC8+R9).
    *  - `compound_code` is a 6 character or longer local code with an explicit location (CWC8+R9, Mountain View, CA, USA).
    *
    * Typically, both the global code and compound code are returned.
    * However, if the result is in a remote location (for example, an ocean or desert) only the global code may be returned.
    *
    * @see [Open Location Code](https://en.wikipedia.org/wiki/Open_Location_Code)
    * @see [plus codes](https://plus.codes/)
    */
  var plus_code: PlusCode
  /**
    * The price level of the place, on a scale of 0 to 4.
    * The exact amount indicated by a specific value will vary from region to region.
    *
    * Price levels are interpreted as follows:
    *  - `0`: Free
    *  - `1`: Inexpensive
    *  - `2`: Moderate
    *  - `3`: Expensive
    *  - `4`: Very Expensive
    */
  var price_level: scala.Double
  /** contains the place's rating, from 1.0 to 5.0, based on aggregated user reviews. */
  var rating: scala.Double
  /**
    * a JSON array of up to five reviews. If a `language` parameter was specified in the Place Details request,
    * the Places Service will bias the results to prefer reviews written in that language.
    */
  var reviews: js.Array[PlaceReview]
  /** Indicates the scope of the `place_id`. */
  var scope: PlaceIdScope
  /**
    * contains an array of feature types describing the given result.
    * XML responses include multiple `<type>` elements if more than one type is assigned to the result.
    */
  var types: js.Array[AddressType]
  /**
    * contains the URL of the official Google page for this place.
    * This will be the Google-owned page that contains the best available information about the place.
    * Applications must link to or embed this page on any screen that shows detailed results about the place to the user.
    */
  var url: java.lang.String
  /**
    * contains the number of minutes this place’s current timezone is offset from UTC.
    * For example, for places in Sydney, Australia during daylight saving time this would be 660 (+11 hours from UTC),
    * and for places in California outside of daylight saving time this would be -480 (-8 hours from UTC).
    */
  var utc_offset: scala.Double
  /**
    * lists a simplified address for the place, including the street name, street number, and locality,
    * but not the province/state, postal code, or country. For example, Google's Sydney, Australia office
    * has a `vicinity` value of `48 Pirrama Road, Pyrmont`.
    */
  var vicinity: scala.Double
  /** lists the authoritative website for this place, such as a business' homepage. */
  var website: java.lang.String
}

object PlaceDetailsResult {
  @scala.inline
  def apply(
    address_components: js.Array[AddressComponent],
    adr_address: java.lang.String,
    alt_ids: js.Array[AlternativePlaceId],
    formatted_address: java.lang.String,
    formatted_phone_number: java.lang.String,
    geometry: AddressGeometry,
    icon: java.lang.String,
    international_phone_number: java.lang.String,
    name: java.lang.String,
    opening_hours: OpeningHours,
    permanently_closed: scala.Boolean,
    photos: js.Array[PlacePhoto],
    place_id: java.lang.String,
    plus_code: PlusCode,
    price_level: scala.Double,
    rating: scala.Double,
    reviews: js.Array[PlaceReview],
    scope: PlaceIdScope,
    types: js.Array[AddressType],
    url: java.lang.String,
    utc_offset: scala.Double,
    vicinity: scala.Double,
    website: java.lang.String
  ): PlaceDetailsResult = {
    val __obj = js.Dynamic.literal(address_components = address_components, adr_address = adr_address, alt_ids = alt_ids, formatted_address = formatted_address, formatted_phone_number = formatted_phone_number, geometry = geometry, icon = icon, international_phone_number = international_phone_number, name = name, opening_hours = opening_hours, permanently_closed = permanently_closed, photos = photos, place_id = place_id, plus_code = plus_code, price_level = price_level, rating = rating, reviews = reviews, scope = scope, types = types, url = url, utc_offset = utc_offset, vicinity = vicinity, website = website)
  
    __obj.asInstanceOf[PlaceDetailsResult]
  }
}

