import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { LandingPageAdminComponent } from './landing-page-admin/landing-page-admin.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './auth.guard';
import { ImportDataComponent } from './landing-page-admin/import-data/import-data.component';
import { Chart1Component } from './landing-page/chart1/chart1.component';
import { AddCompanyComponent } from './add-company/add-company.component';


const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: 'landing_page_admin', component: LandingPageAdminComponent, canActivate: [AuthGuard], 
    children: [
    { path: 'import_data', component: ImportDataComponent}
    ]
  },
  {path: 'landing_page_admin', component: LandingPageAdminComponent, canActivate: [AuthGuard], 
    children: [
    { path: 'add_company', component: AddCompanyComponent}
    ]
  },
  {path: 'upload', redirectTo: 'http://localhost:9000/upload', pathMatch: 'full'},
  {path: 'landing_page', component: LandingPageComponent, canActivate: [AuthGuard] },
  {path: 'landing_page', component: LandingPageComponent, canActivate: [AuthGuard], 
    children: [
    { path: 'compare_company', component: Chart1Component}
    ]
  },
  {path: 'ttttt', component: Chart1Component, outlet: 'sidebar' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
}
