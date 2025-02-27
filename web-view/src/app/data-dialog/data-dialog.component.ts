import {Component, Inject} from '@angular/core';
import {
    MAT_DIALOG_DATA,
    MatDialogActions,
    MatDialogClose,
    MatDialogContent,
    MatDialogTitle
} from "@angular/material/dialog";
import {MatButton} from "@angular/material/button";
import {JsonPipe} from "@angular/common";

@Component({
    selector: 'app-data-dialog',
    imports: [
        MatDialogContent,
        MatDialogTitle,
        MatDialogActions,
        MatDialogClose,
        MatButton,
        JsonPipe
    ],
    templateUrl: './data-dialog.component.html',
    styleUrl: './data-dialog.component.css'
})
export class DataDialogComponent {
    constructor(@Inject(MAT_DIALOG_DATA) protected data: any) {
    }
}
