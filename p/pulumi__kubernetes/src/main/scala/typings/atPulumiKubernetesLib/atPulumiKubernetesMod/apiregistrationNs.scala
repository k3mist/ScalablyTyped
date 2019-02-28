package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "apiregistration")
@js.native
object apiregistrationNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * APIService represents a server for a particular GroupVersion. Name must be "version.group".
      */
    @js.native
    class APIService protected ()
      extends atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIService {
      /**
        * Create a apiregistration.v1.APIService resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1Ns.APIService) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1Ns.APIService, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * APIServiceList is a list of APIService objects.
      */
    @js.native
    class APIServiceList protected ()
      extends atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIServiceList {
      /**
        * Create a apiregistration.v1.APIServiceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1Ns.APIServiceList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1Ns.APIServiceList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object APIService extends js.Object {
      /**
        * Get the state of an existing `APIService` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIService = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIService = js.native
    }
    
    /* static members */
    @js.native
    object APIServiceList extends js.Object {
      /**
        * Get the state of an existing `APIServiceList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIServiceList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIServiceList = js.native
    }
    
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * APIService represents a server for a particular GroupVersion. Name must be "version.group".
      */
    @js.native
    class APIService protected ()
      extends atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIService {
      /**
        * Create a apiregistration.v1beta1.APIService resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1beta1Ns.APIService) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1beta1Ns.APIService, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * APIServiceList is a list of APIService objects.
      */
    @js.native
    class APIServiceList protected ()
      extends atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIServiceList {
      /**
        * Create a apiregistration.v1beta1.APIServiceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1beta1Ns.APIServiceList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1beta1Ns.APIServiceList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object APIService extends js.Object {
      /**
        * Get the state of an existing `APIService` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIService = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIService = js.native
    }
    
    /* static members */
    @js.native
    object APIServiceList extends js.Object {
      /**
        * Get the state of an existing `APIServiceList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIServiceList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIServiceList = js.native
    }
    
  }
  
}

