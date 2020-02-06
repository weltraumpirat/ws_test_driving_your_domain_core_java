package eu.ddd;

import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

public class ShoppingCartSteps implements En {

  public ShoppingCartSteps() {

    Given( "^the following available products:$", (DataTable table) -> {
    } );
    Given( "^the empty shopping cart$", () -> {
    } );
    Given( "^the shopping cart contains the following items:$", ( DataTable table ) -> {
    } );
    When( "^I add the following item:$", ( DataTable table ) -> {
    } );
    When( "^I remove the following item:$", ( DataTable table ) -> {
    } );
    When( "^I proceed to check out$", () -> {
    } );
    Then( "^the shopping cart contains (\\d+) item$", ( Integer itemCount ) -> {
    } );
    Then( "^the first item is \"([^\"]*)\"$", ( String itemName ) -> {
    } );
    Then( "^the shopping cart is empty$", () -> {
    } );
    Then( "the following order with a total amount due of {double} EUR is created:",
          ( Double total, DataTable table ) -> {
          } );
  }
}
