import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PostComponent } from './post/post.component';
import { CardComponent } from './post/card/card.component';
import { ListComponent } from './post/list/list.component';
import { ModalPostComponent } from './post/modal-post/modal-post.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { MoreComponent } from './post/more/more.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PostComponent,
    CardComponent,
    ListComponent,
    ModalPostComponent,
    MoreComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    CommonModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
