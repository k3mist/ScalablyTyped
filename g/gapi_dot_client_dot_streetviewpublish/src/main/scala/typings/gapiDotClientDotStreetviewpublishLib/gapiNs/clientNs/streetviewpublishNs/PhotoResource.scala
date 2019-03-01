package typings
package gapiDotClientDotStreetviewpublishLib.gapiNs.clientNs.streetviewpublishNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoResource extends js.Object {
  /**
    * After the client finishes uploading the photo with the returned
    * UploadRef,
    * CreatePhoto
    * publishes the uploaded Photo to
    * Street View on Google Maps.
    *
    * Currently, the only way to set heading, pitch, and roll in CreatePhoto is
    * through the [Photo Sphere XMP
    * metadata](https://developers.google.com/streetview/spherical-metadata) in
    * the photo bytes. The `pose.heading`, `pose.pitch`, `pose.roll`,
    * `pose.altitude`, and `pose.level` fields in Pose are ignored for
    * CreatePhoto.
    *
    * This method returns the following error codes:
    *
    * &#42; google.rpc.Code.INVALID_ARGUMENT if the request is malformed.
    * &#42; google.rpc.Code.NOT_FOUND if the upload reference does not exist.
    * &#42; google.rpc.Code.RESOURCE_EXHAUSTED if the account has reached the
    * storage limit.
    */
  def create(request: gapiDotClientDotStreetviewpublishLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Photo]
  /**
    * Deletes a Photo and its metadata.
    *
    * This method returns the following error codes:
    *
    * &#42; google.rpc.Code.PERMISSION_DENIED if the requesting user did not
    * create the requested photo.
    * &#42; google.rpc.Code.NOT_FOUND if the photo ID does not exist.
    */
  def delete(request: gapiDotClientDotStreetviewpublishLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Gets the metadata of the specified
    * Photo.
    *
    * This method returns the following error codes:
    *
    * &#42; google.rpc.Code.PERMISSION_DENIED if the requesting user did not
    * create the requested Photo.
    * &#42; google.rpc.Code.NOT_FOUND if the requested
    * Photo does not exist.
    */
  def get(request: gapiDotClientDotStreetviewpublishLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Photo]
  /**
    * Creates an upload session to start uploading photo bytes. The upload URL of
    * the returned UploadRef is used to
    * upload the bytes for the Photo.
    *
    * In addition to the photo requirements shown in
    * https://support.google.com/maps/answer/7012050?hl=en&ref_topic=6275604,
    * the photo must also meet the following requirements:
    *
    * &#42; Photo Sphere XMP metadata must be included in the photo medadata. See
    * https://developers.google.com/streetview/spherical-metadata for the
    * required fields.
    * &#42; The pixel size of the photo must meet the size requirements listed in
    * https://support.google.com/maps/answer/7012050?hl=en&ref_topic=6275604, and
    * the photo must be a full 360 horizontally.
    *
    * After the upload is complete, the
    * UploadRef is used with
    * CreatePhoto
    * to create the Photo object entry.
    */
  def startUpload(request: gapiDotClientDotStreetviewpublishLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[UploadRef]
  /**
    * Updates the metadata of a Photo, such
    * as pose, place association, connections, etc. Changing the pixels of a
    * photo is not supported.
    *
    * Only the fields specified in the
    * updateMask
    * field are used. If `updateMask` is not present, the update applies to all
    * fields.
    *
    * <aside class="note"><b>Note:</b> To update
    * Pose.altitude,
    * Pose.latLngPair has to be
    * filled as well. Otherwise, the request will fail.</aside>
    *
    * This method returns the following error codes:
    *
    * &#42; google.rpc.Code.PERMISSION_DENIED if the requesting user did not
    * create the requested photo.
    * &#42; google.rpc.Code.INVALID_ARGUMENT if the request is malformed.
    * &#42; google.rpc.Code.NOT_FOUND if the requested photo does not exist.
    */
  def update(request: gapiDotClientDotStreetviewpublishLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Photo]
}

object PhotoResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotStreetviewpublishLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Photo]
    ],
    delete: js.Function1[
      gapiDotClientDotStreetviewpublishLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotStreetviewpublishLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Photo]
    ],
    startUpload: js.Function1[
      gapiDotClientDotStreetviewpublishLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[UploadRef]
    ],
    update: js.Function1[
      gapiDotClientDotStreetviewpublishLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[Photo]
    ]
  ): PhotoResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, startUpload = startUpload, update = update)
  
    __obj.asInstanceOf[PhotoResource]
  }
}

