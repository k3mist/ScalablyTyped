package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuardiansResource extends js.Object {
  /**
    * Deletes a guardian.
    *
    * The guardian will no longer receive guardian notifications and the guardian
    * will no longer be accessible via the API.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if no user that matches the provided `student_id`
    * is visible to the requesting user, if the requesting user is not
    * permitted to manage guardians for the student identified by the
    * `student_id`, if guardians are not enabled for the domain in question,
    * or for other access errors.
    * &#42; `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
    * be recognized (it is not an email address, nor a `student_id` from the
    * API).
    * &#42; `NOT_FOUND` if the requesting user is permitted to modify guardians for
    * the requested `student_id`, but no `Guardian` record exists for that
    * student with the provided `guardian_id`.
    */
  def delete(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsGuardianId): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Returns a specific guardian.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if no user that matches the provided `student_id`
    * is visible to the requesting user, if the requesting user is not
    * permitted to view guardian information for the student identified by the
    * `student_id`, if guardians are not enabled for the domain in question,
    * or for other access errors.
    * &#42; `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
    * be recognized (it is not an email address, nor a `student_id` from the
    * API, nor the literal string `me`).
    * &#42; `NOT_FOUND` if the requesting user is permitted to view guardians for
    * the requested `student_id`, but no `Guardian` record exists for that
    * student that matches the provided `guardian_id`.
    */
  def get(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsGuardianId): gapiDotClientLib.gapiNs.clientNs.Request[Guardian]
  /**
    * Returns a list of guardians that the requesting user is permitted to
    * view, restricted to those that match the request.
    *
    * To list guardians for any student that the requesting user may view
    * guardians for, use the literal character `-` for the student ID.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if a `student_id` is specified, and the requesting
    * user is not permitted to view guardian information for that student, if
    * `"-"` is specified as the `student_id` and the user is not a domain
    * administrator, if guardians are not enabled for the domain in question,
    * if the `invited_email_address` filter is set by a user who is not a
    * domain administrator, or for other access errors.
    * &#42; `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
    * be recognized (it is not an email address, nor a `student_id` from the
    * API, nor the literal string `me`). May also be returned if an invalid
    * `page_token` is provided.
    * &#42; `NOT_FOUND` if a `student_id` is specified, and its format can be
    * recognized, but Classroom has no record of that student.
    */
  def list(
    request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsInvitedEmailAddressKey
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListGuardiansResponse]
}

object GuardiansResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsGuardianId, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsGuardianId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Guardian]
    ],
    list: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsInvitedEmailAddressKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListGuardiansResponse]
    ]
  ): GuardiansResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, list = list)
  
    __obj.asInstanceOf[GuardiansResource]
  }
}

