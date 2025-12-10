module project.salesystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires kotlin.stdlib;
    requires java.sql;
    requires javafx.graphics;
    requires com.zaxxer.hikari;
    requires jfx.incubator.richtext;

    opens project.salesystem to javafx.fxml;
    exports project.salesystem;



}