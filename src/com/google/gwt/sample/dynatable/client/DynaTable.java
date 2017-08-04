/*
 * Copyright 2007 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.sample.dynatable.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.view.client.ListDataProvider;
import com.sencha.gxt.widget.core.client.form.StringComboBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The entry point class which performs the initial loading of the DynaTable
 * application.
 */
public class DynaTable implements EntryPoint {

    private String filter = "";

    private static class Contact {

        private final String address;
        private final String name;

        public Contact(String name, String address) {
            this.name = name;
            this.address = address;
        }
    }

    private static List<Contact> contacts = Arrays.asList(new Contact("John",
            "123 Fourth Road"), new Contact("Mary", "222 Lancer Lane"), new Contact(
            "Zander", "94 Road Street"));

    @Override
    public void onModuleLoad() {

        final StringComboBox combobox = new StringComboBox();
        CellTable<Contact> table = new CellTable<>();
        final List<Contact> list = new ArrayList<>();
        final ListDataProvider<Contact> dataProvider = new ListDataProvider<>(new ArrayList(contacts));

        dataProvider.addDataDisplay(table);

        TextColumn<Contact> nameColumn = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact contact) {
                return contact.name;
            }
        };

        TextColumn<Contact> addressColumn = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact contact) {
                return contact.address;
            }
        };

        table.addColumn(nameColumn, "Name");
        table.addColumn(addressColumn, "Address");

        final ChangeHandler chandler = new ChangeHandler() {
            @Override
            public void onChange(ChangeEvent event) {
                filter = combobox.getCurrentValue() == null ? "" : combobox.getCurrentValue().toLowerCase();

                list.clear();
                for (Contact contact : contacts) {
                    if (contact.name.toLowerCase().startsWith(filter)) {
                        list.add(contact);
                    }
                }
                dataProvider.setList(list);
            }
        };

        combobox.addKeyUpHandler(new KeyUpHandler() {
            @Override
            public void onKeyUp(KeyUpEvent event) {
                chandler.onChange(null);
            }
        });

        combobox.addChangeHandler(chandler);

        RootPanel.get().add(combobox);
        RootPanel.get().add(table);
    }
}
